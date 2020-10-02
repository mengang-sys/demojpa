package com.my.demojpa.annotation;

public class Message2 {

    @DefaultAnnotation(title = "MLDN")
    public void send(String msg){
        System.out.println("消息发送："+msg);

    }
}
