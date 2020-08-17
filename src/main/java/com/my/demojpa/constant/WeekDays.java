package com.my.demojpa.constant;

public enum WeekDays {

    MONDAY("星期一", 0),
    TUESDAY("星期二", 1),
    WEDNESDAY("星期三", 2),
    THURSDAY("星期四", 3),
    FRIDAY("星期五", 4),
    ;
    private String name;
    private int index;

    private WeekDays(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public String toString() {
        return "WeekDays{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
