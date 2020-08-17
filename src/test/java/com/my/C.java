package com.my;

public class C {

    public static void main(String[] args) {
        Thread t3 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName()+"...ccc");
                }
            }
        };

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(getName()+"...aaa");
                }
            }
        };


        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(getName()+"...bbb");
                }
            }
        };

        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }



}
