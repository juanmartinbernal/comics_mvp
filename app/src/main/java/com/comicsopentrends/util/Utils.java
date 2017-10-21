package com.comicsopentrends.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.comicsopentrends.R;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Asus on 20/10/2017.
 */

public class Utils {

    /**
     * Método encargado de reemplazar un fragmneto
     *
     * @param fragment
     */
    public static void replaceFragment(Fragment fragment, int container,FragmentManager fragmentManager ) {
        FragmentManager fm = fragmentManager;
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(container, fragment);
        ft.commit();
    }


    public static String md5(final String s) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest
                    .getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
