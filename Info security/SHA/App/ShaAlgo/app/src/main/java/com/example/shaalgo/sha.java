package com.example.shaalgo;

import android.widget.RadioGroup;

import java.security.MessageDigest;

public class sha {
    public static byte[] encryptSHA(byte[] data,String shaN)throws Exception{
        MessageDigest sha= MessageDigest.getInstance(shaN);
        sha.update(data);
        return sha.digest();
    }
}

