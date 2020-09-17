package com.my.demojpa.array;

public class Car {

     private String name;
     private double price;
     private Person person;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getInfo() {
       return "汽车品牌型号:"+this.name+",汽车价值:"+this.price;
    }
}
