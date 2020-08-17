package com.my.demojpa.reset;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class C {

    public static void main(String[] args) {
   /*     Calendar calendar = Calendar.getInstance();
        calendar.set(2018,7,18);
        Date date = calendar.getTime();
        System.out.println("格式化前date"+date);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("格式化后date"+df.format(date));
        System.out.println();

        calendar.clear();
        calendar.set(Calendar.YEAR,2018);
        calendar.set(Calendar.MONDAY,7);
        calendar.set(Calendar.DATE,28);
        date = calendar.getTime();
        System.out.println("格式化前date"+date);
        System.out.println("格式化后date"+df.format(date));*/

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("格式化之前："+dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String text = dateTime.format(formatter);
        System.out.println("dateTime格式化后："+text);
        LocalDateTime parsedDateTime = LocalDateTime.parse("2018-08-18 08:58:18", formatter);
        System.out.println("LocalDateTime解析后:"+parsedDateTime);
    }
}
