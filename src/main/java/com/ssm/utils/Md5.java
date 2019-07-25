package com.ssm.utils;

import org.springframework.util.DigestUtils;

/**
 * @date 2019-04-03-21-08
 */
public class Md5 {

    public static String md5(String text) {
        //
        String encodeStr = DigestUtils.md5DigestAsHex(text.getBytes());
        return encodeStr;
    }

    public static boolean verify(String text, String md5) {
        //根据传入的密钥进行验证
        String md5Text = md5(text);
        if (md5Text.equalsIgnoreCase(md5)) {
            return true;
        }
        return false;
    }

}
