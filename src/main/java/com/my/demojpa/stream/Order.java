package com.my.demojpa.stream;

public class Order {

    private String name;
    private int amout;
    private double price;

    public Order() {
    }

    public Order(String name, int amout, double price) {
        this.name = name;
        this.amout = amout;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
