package com.my;

public class JvmVerifyThread {

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            new Demo();
        }

        for (int i = 0; i < 100000; i++) {
            System.out.println("我是主线程");
        }
        System.out.println("main:"+Thread.currentThread().isDaemon());//验证主线程不是daemon
        System.out.println("主线程死亡");
    }


}

class Demo{
    @Override
    protected void finalize() throws Throwable {
        System.out.println(Thread.currentThread().isDaemon());//验证Gc线程是不是daemon
        System.out.println("垃圾被清扫了");
    }
}