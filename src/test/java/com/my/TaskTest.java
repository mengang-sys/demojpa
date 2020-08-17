package com.my;




import org.springframework.scheduling.config.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {
    //这是一个菲波拉契数列问题
/*    public static void main(String[] args) {

        int f1 =1,f2=1,f;
        int m =30;
        System.out.println(f1);
        System.out.println(f2);

        for (int i = 3; i < m; i++) {
            f= f2;
            f2 = f1+f2;
            f1 = f;
            System.out.println(f2);
        }
    }*/
//判断101-200之间有多少个素数，并输出所有素数。
   /* public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i+=2) {
            boolean flag = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i%j ==0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                count++;
                System.out.println(i);
            }
        }
    }*/
    /**
     * 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
     * 其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
     **/
/*    public static void main(String[] args) {
        int a,b,c;
        for (int i =101;i<1000;i++){
            a = i%10;
            b = i/10%10;
            c = i/100;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }*/

 


}
