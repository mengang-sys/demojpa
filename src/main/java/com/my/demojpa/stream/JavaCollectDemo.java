package com.my.demojpa.stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaCollectDemo {
    public static void main(String[] args) {
/*        List<String> all = new ArrayList<>();
        Collections.addAll(all,"Java","JavaScript","JSP","Json","Python","Ruby","Go");
        Stream<String> stream = all.stream();
        List<String> result = stream.filter(ele -> ele.toLowerCase().contains("j")).skip(2).limit(2).collect(Collectors.toList());
        System.out.println(result);*/

        List<Order> all = new ArrayList<Order>();
        all.add(new Order("狗熊娃娃",10,9.9));
        all.add(new Order("MLDN-极限IT",3,2890.0));
        all.add(new Order("MLDN系列教材",8,8987.9));
        all.add(new Order("MLDN定制笔记本",800,2.9));
        all.add(new Order("MLDN定制鼠标坐垫",138,0.9));
        DoubleSummaryStatistics stat = all.stream().filter(ele -> ele.getName().toLowerCase().contains("mldn")).mapToDouble(orderObject -> orderObject.getPrice() * orderObject.getAmout()).summaryStatistics();
        System.out.println(stat.getCount());
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
        System.out.println(stat.getMax());

    }
}
