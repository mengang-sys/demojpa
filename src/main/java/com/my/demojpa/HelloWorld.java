package com.my.demojpa;

import com.my.demojpa.annotation.MyAnnotation1;

import java.io.*;
import java.lang.reflect.Constructor;

public class HelloWorld {

    @MyAnnotation1(value = "Annotation")
    private String info = "";

    @MyAnnotation1(count = 10)
    public static void main(String[] args) {
        set(100);
        set(3);
        set(10);
    }

    public static void set(int x){
        if(x == 3){
            return ;
        }
        System.out.println(x);
    }
}
