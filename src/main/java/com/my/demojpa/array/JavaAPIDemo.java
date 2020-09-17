package com.my.demojpa.array;

import java.util.Optional;

public class JavaAPIDemo {
    public static void main(String[] args) {
        Optional<IMessage> opt = MessageUtil.getMessage();
        if(opt.isPresent()){
            IMessage temp = opt.get();
            MessageUtil.useMessage(temp);
        }
    }


}
