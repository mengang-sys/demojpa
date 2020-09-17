package com.my.demojpa.array;

public class ArrayDemo {

    public static void main(String[] args) {
        int dataA[] = new int[]{1,2,3,4,5,6,7,8,9};
        int dataB[] = new int[]{11,22,33,44,55,66,77,88,99};
        System.arraycopy(dataA,5,dataB,3,3);
        ArrayUtil.printArray(dataB);
    }
}
