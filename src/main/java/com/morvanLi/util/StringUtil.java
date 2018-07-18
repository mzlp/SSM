package com.morvanLi.util;

/**
 * Created by hao.ding on 2014/11/3.
 */
public class StringUtil {
    public static boolean isBlank(String str) {
        int strLen;
        if ((str == null) || ((strLen = str.length()) == 0))
            return true;
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(String s) {
        return !isBlank(s);
    }

    public static String transformNull(Object source, String target) {
        if (source == null) {
            return target;
        } else {
            return source.toString();
        }
    }
}
