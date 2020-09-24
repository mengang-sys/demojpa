package com.my.demojpa.list;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        System.out.println("删除前list:"+list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("fff")){
                list.remove(i);
            }
        }
        System.out.println("删除后list:"+list);
    }
}
