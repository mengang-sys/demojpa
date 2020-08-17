package com.my.demojpa.exception;

import com.my.demojpa.thread.Runner;
import com.my.demojpa.thread.Stack;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import sun.java2d.pipe.SpanShapeRenderer;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorlda {

/*    public static void main(String[] args) {
        int a = 0;
        int result = divide(5, a);
        System.out.printf("divide(%d,%d) = %d", 5, a, result);

    }

    public static int divide(int number, int divisor) {
        try {
            return number / divisor;
        } catch (Throwable throwable) {
            System.out.println("getMessage():" + throwable.getMessage());
            System.out.println("toString():" + throwable.toString());
            System.out.println("printStackTrace()输出如下信息：");
            throwable.printStackTrace();
        }
        return 0;
    }*/

   /* public static void main(String[] args) {
        Date date = readDate();
        System.out.println("读取的日期：" + date);
    }

    public static Date readDate() {
        FileInputStream readFile = null;
        InputStreamReader ir = null;
        BufferedReader in = null;
        try {
            readFile = new FileInputStream("C:\\Users\\ASUS\\Desktop\\readme.txt");
            ir = new InputStreamReader(readFile);
            in = new BufferedReader(ir);
            //读取文件中的一行数据
            String str = in.readLine();
            if (str == null) {
                return null;
            }
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date date = df.parse(str);
            return date;
        } catch (FileNotFoundException e) {
            System.out.println("处理FileNotFoundException...");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("处理IOException...");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("处理ParseException...");
            e.printStackTrace();
        } finally {
            try {
                if (readFile != null) {
                    readFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ir != null) {
                    ir.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }*/

   /* public static Date readDate() throws MyException {
        //自动资源管理
        try (FileInputStream readFile = new FileInputStream("C:\\Users\\ASUS\\Desktop\\readme.txt");
             InputStreamReader ir = new InputStreamReader(readFile);
             BufferedReader in = new BufferedReader(ir);
        ) {
            //读取文件中的一行
            String str = in.readLine();
            if (str == null) {
                return null;
            }
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date date = df.parse(str);
            return date;
        } catch (FileNotFoundException e) {
            throw new MyException(e.getMessage());
        } catch (IOException e) {
            throw new MyException(e.getMessage());
        } catch (ParseException e) {
            System.out.println("处理ParseException...");
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            final Date date = readDate();
            System.out.println("读取的日期:" + date);
        } catch (MyException e) {
            System.out.println("处理MyException...");
            e.printStackTrace();
        }
    }*/

/*    public static void main(String[] args) {
        System.out.println(isEquals(new Integer(1),new Integer(2)));
    }

    public static <T extends Number> boolean isEquals(T a,T b){
        return a.equals(b);
    }*/
    /* private static String command = "";
    public static void main(String[] args) {*/
  /*       Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%d,%s",i,Thread.currentThread().getName());
                    try{
                        long sleepTime = (long) (1000*Math.random());
                        Thread.sleep(sleepTime);
                    }catch (InterruptedException e){

                    }
                }
                System.out.println("执行完成");
            }
        });

         t1.start();

         Thread t2 = new Thread(() ->{

         });*/

     /*Thread t1 = new Thread(()->{
         while(!command.equalsIgnoreCase("exit")){
             System.out.println("下载中");
             try{
                 Thread.sleep(10000);
             }catch (InterruptedException e){

             }
         }
         System.out.println("执行完成");
     });
     t1.start();
        try(InputStreamReader ir = new InputStreamReader(System.in); final BufferedReader in = new BufferedReader(ir)){
            command = in.readLine();
        }catch (IOException e){

     }
    }

*/


    public static void main(String[] args) {
         Stack stack = new Stack();
         //下面的消费者和生产者锁操作的是同一个堆栈对象stack
        //生产者线程
        Thread producer = new Thread(()->{
            char c;
            for (int i = 0; i < 10; i++) {
                //随机产生10个字符
                c = (char)(Math.random() *26+'A');
                //把字符压栈
                stack.push(c);
                //打印字符
                System.out.println("生产:"+c);
                try {
                    //每生产一个字符线程就睡眠
                    Thread.sleep((int)(Math.random()*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //消费者线程
        Thread consumer = new Thread(()->{
            char c;
            for (int i = 0; i < 10; i++) {
                //从堆栈中读取字符
                 c = stack.pop();
                 //打印字符
                System.out.println("消费:"+c);
                try {
                    //每读取一个字符线程就睡眠
                    Thread.sleep((int)(Math.random()*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }









}
