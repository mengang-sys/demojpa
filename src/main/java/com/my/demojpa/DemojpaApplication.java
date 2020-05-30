package com.my.demojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojpaApplication {


    public static void main(String[] args) {

        SpringApplication.run(DemojpaApplication.class, args);
        int[] a = new int[20];
        System.out.println(a[1]);
    }

}
