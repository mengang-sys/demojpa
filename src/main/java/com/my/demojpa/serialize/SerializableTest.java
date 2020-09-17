package com.my.demojpa.serialize;

import java.io.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SerializableTest {

    private static void serialize(User user) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\ASUS\\Desktop\\aaa.txt")));
        oos.writeObject(user);
        oos.close();
    }

    private static User deserialize() throws Exception {
        ObjectInputStream ios = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\ASUS\\Desktop\\aaa.txt")));
        return (User) ios.readObject();
    }

    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setAge(19);
        user.setName("aaaa");
        System.out.println("序列化前的结果：" + user);

        serialize(user);

        final User user1 = deserialize();
        System.out.println("反序列化后的结果:" + user1);

        Map<String, Object> map = new ConcurrentHashMap();
    }
}