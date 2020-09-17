package com.my.demojpa.thread1;


public class MyThread implements Runnable {

    private int ticket = 3;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (this.ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，thicket =" + this.ticket--);
                } else {
                    System.out.println("票已经卖光了");
                    break;//跳出循环
                }
            }
        }
    }
}
