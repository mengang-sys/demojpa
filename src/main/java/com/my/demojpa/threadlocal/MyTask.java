package com.my.demojpa.threadlocal;

import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"定时任务，当前时间："+System.currentTimeMillis());
    }

}
