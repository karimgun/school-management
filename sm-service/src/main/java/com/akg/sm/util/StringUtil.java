package com.akg.sm.util;

public class StringUtil {

    public static String killWS(String s){
        if(s == null) return s;
        String newString = s.trim();
        if(s.length() == 0) return null;
        return newString;
    }
}
