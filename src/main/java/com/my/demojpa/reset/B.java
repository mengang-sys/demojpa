package com.my.demojpa.reset;

import com.my.demojpa.constant.WeekDays;

import java.util.Objects;

public class B implements A {
    @Override
    public void send() {
    }

    public static void main(String[] args) {
        for (WeekDays value : WeekDays.values()) {
            System.out.println(value);
        }
    }

    private String name;
    private int age;

    public B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return age == b.age &&
                Objects.equals(name, b.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
