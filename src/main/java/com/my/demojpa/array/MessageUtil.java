package com.my.demojpa.array;

import java.util.Optional;

public class MessageUtil {

    private MessageUtil() {}

    public static Optional<IMessage> getMessage() {
        return Optional.of(new MessageImpl());
    }

    public static void useMessage(IMessage msg){
        System.out.println(msg);
    }
}
