package com.my.demojpa.threadlocal;

import com.fasterxml.jackson.databind.ser.Serializers;

import java.util.Base64;

public class StringUtil {

    private static final String SLAT = "mldnjava";//公共的盐值
    private static final int REPEAT = 5; //加密次数

    public static String encode(String str){
        String temp = str + "{"+SLAT+"}";
        byte data[] = temp.getBytes();
        for (int X = 0; X < REPEAT; X++) {
            data = Base64.getEncoder().encode(data);
        }
        return new String(data);
    }

    public static String decode(String str){
        byte data[] = str.getBytes();
        for (int x = 0; x < REPEAT; x++) {
            data = Base64.getDecoder().decode(data);
        }
        return new String(data).replaceAll("\\{\\w+\\}","");
    }

    public static void main(String[] args) {
        String str = StringUtil.encode("www.mldn.cn");
        System.out.println(StringUtil.decode(str));
    }
}
