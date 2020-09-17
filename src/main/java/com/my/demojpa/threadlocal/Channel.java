package com.my.demojpa.threadlocal;

public class Channel {

    private static final ThreadLocal<Message> THREADLOCAL = new ThreadLocal<Message>();

    private Channel() {}

    public static void setMessage(Message msg){
        THREADLOCAL.set(msg);
    }

    public static void send(){
        System.out.println("["+Thread.currentThread().getName()+".消息通道"+THREADLOCAL.get().getInfo());
    }
}
