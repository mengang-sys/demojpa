package com.my.demojpa.threadlocal;

import java.util.Base64;
import java.util.Timer;

public class JavaAPIDemo {

    public static void main(String[] args) {
      /*  new Thread(()->{
            Message msg = new Message();
            msg.setInfo("线程A消息：www.mldn.cn");
            Channel.setMessage(msg);
            Channel.send();
        },"消息发送A").start();
        new Thread(()->{
            Message msg = new Message();
            msg.setInfo("线程B消息：www.yootk.cn");
            Channel.setMessage(msg);
            Channel.send();
        },"消息发送B").start();
        new Thread(()->{
            Message msg = new Message();
            msg.setInfo("线程C消息：www.java.cn");
            Channel.setMessage(msg);
            Channel.send();
        },"消息发送C").start();
*/

      /*  Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTask(),100,1000);*/

        String msg = "www.java.com";
        String encMsg = new String(Base64.getEncoder().encode(msg.getBytes()));
        System.out.println(encMsg);
        String oldMsg = new String(Base64.getDecoder().decode(encMsg));
        System.out.println(oldMsg);
    }
}
