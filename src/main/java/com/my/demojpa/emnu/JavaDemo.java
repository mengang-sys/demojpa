package com.my.demojpa.emnu;

public class JavaDemo {

    public static void main(String[] args) {
         IFunction<Integer,String> fun = String::valueOf;
         String s = fun.change(100);
        System.out.println(s.length());
    }
}
