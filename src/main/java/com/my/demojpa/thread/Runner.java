package com.my.demojpa.thread;

public class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("第%d次执行 - %s\n",i,Thread.currentThread().getName());
            try {
                long sleepTime = (long) (1000 * Math.random());
                Thread.sleep(sleepTime);
            }catch (InterruptedException e){

            }
        }
        System.out.println("执行完成！"+Thread.currentThread().getName());
    }
}
