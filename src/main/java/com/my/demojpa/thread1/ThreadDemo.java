package com.my.demojpa.thread1;

public class ThreadDemo {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt,"售票员A").start();
        new Thread(mt,"售票员B").start();
        new Thread(mt,"售票员C").start();

    }
}
