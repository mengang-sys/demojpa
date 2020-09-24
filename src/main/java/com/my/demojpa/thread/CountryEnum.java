package com.my.demojpa.thread;

import lombok.Getter;

public enum CountryEnum {

    ONE(1, "齐"),
    TWO(2, "楚"),
    THREE(3, "赵"),
    FOUR(4, "魏"),
    FIVE(5, "赵"),
    SEX(6, "韩");

    @Getter
    private Integer retCode;
    @Getter
    private String retMessage;

    CountryEnum(Integer retCode, String retMessage) {
        this.retCode = retCode;
        this.retMessage = retMessage;
    }

    public static CountryEnum forEach_CountryEnum(int index) {
        for (CountryEnum element : CountryEnum.values()) {
            if (element.getRetCode() == index) {
                return element;
            }
        }
        return null;
    }
}
