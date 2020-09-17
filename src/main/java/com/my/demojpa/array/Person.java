package com.my.demojpa.array;

public class Person {

    private String name;
    private int age;
    private Car car;
    private Person children[];

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person[] getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }

    public String getInfo(){
        return "姓名:"+this.name+"，年龄:"+this.age;
    }
}
