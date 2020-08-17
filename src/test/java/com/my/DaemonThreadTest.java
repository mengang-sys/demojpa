package com.my;

public class DaemonThreadTest implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(100);
            String str = "会不会输出";
            System.out.println(str);
        } catch(RuntimeException e1){
            e1.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DaemonThreadTest tr = new DaemonThreadTest();
        Thread thread = new Thread(tr);
        thread.setDaemon(true);
        thread.start();
    }
}
