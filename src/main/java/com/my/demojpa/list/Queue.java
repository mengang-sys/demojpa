package com.my.demojpa.list;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    //声明保存队列元素集合items
    private List<T> items;

    public Queue(){
        this.items = new ArrayList<T>();
    }

    public void queue(T item){
        this.items.add(item);
    }

    public T dequeue(){
        if(items.isEmpty()){
            return null;
        }else{
            return this.items.remove(0);
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "items=" + items +
                '}';
    }
}
