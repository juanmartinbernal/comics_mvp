package com.comicsopentrends.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Asus on 20/10/2017.
 */

public class Data {

    @SerializedName("offset")
    public int offset;
    @SerializedName("limit")
    public int limit;
    @SerializedName("total")
    public int total;
    @SerializedName("count")
    public int count;

    @SerializedName("results")
    public List<Character> results;
}
