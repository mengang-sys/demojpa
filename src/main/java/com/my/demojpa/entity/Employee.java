package com.my.demojpa.entity;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String address;
    private Integer salary;
    private Integer age;

    public Employee() {
    }


    public Employee(String name, String address, Integer salary, Integer age) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
