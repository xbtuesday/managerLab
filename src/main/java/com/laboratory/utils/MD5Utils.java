package com.laboratory.utils;/**
 * Created by Administrator on 2017/12/22.
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * 生成MD5加密
 * MD5 encode
 * Created by Lpan on 2017/12/22.
 */
public class MD5Utils {
    public  static  String  encode(String  source){
        String hexString = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] digest = messageDigest.digest();
            hexString = byteArrayToHexString(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hexString;
    }

    private static String byteArrayToHexString(byte[] bytes) {
        String hexString = "";
        for (byte b : bytes) {
            int temp = b & 255;
            if (temp < 16 && temp >= 0) {
                hexString = hexString + "0" + Integer.toHexString(temp);
            }else{
                hexString = hexString + Integer.toHexString(temp);
            }
        }
        return hexString;
    }
}
