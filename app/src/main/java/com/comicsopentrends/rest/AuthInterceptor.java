package com.comicsopentrends.rest;


import com.comicsopentrends.util.Utils;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

class AuthInterceptor implements Interceptor {
    private static final String TIMESTAMP_KEY = "ts";
    private static final String HASH_KEY = "hash";
    private static final String APIKEY_KEY = "apikey";

    private final String publicKey;
    private final String privateKey;
    private final String timestampkey;

    AuthInterceptor(String publicKey, String privateKey, String timestampkey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.timestampkey = timestampkey;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        String timestamp = timestampkey;
        String hash = null;
        //TIMESTAMP + PRIVATE_KEY + PUBLIC_KEY
        hash = Utils.md5(timestamp + privateKey + publicKey);

        Request request = chain.request().newBuilder().addHeader("key", "jdkskgds").build();
        HttpUrl url = request.url()
                .newBuilder()
                .addQueryParameter(TIMESTAMP_KEY, timestamp)
                .addQueryParameter(APIKEY_KEY, publicKey)
                .addQueryParameter(HASH_KEY, hash)
                .build();
        request = request.newBuilder().url(url).build();
        return chain.proceed(request);
    }
}