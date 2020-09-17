package com.my.demojpa.demo;


public class Color {

    private static final Color RED = new Color("红色");
    private static final Color GREEN = new Color("蓝色");
    private static final Color BLUE = new Color("绿色");
    private String title;
    private Color(String title){
        this.title = title;
    }

    public static Color getInstance(String color){
        switch (color){
            case "red":
                return RED;
            case "green":
                return RED;
            case "blue":
                return RED;
            default:
                return null;
        }
    }

    public String toString(){
        return this.title;
    }


}
