package com.my.demojpa.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflectDemo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Method method = Message2.class.getMethod("send", String.class);
        DefaultAnnotation anno = method.getAnnotation(DefaultAnnotation.class);
        String meg = anno.title()+"("+anno.url()+")";
        method.invoke(Message2.class.getDeclaredConstructor().newInstance(),meg);
    }
}
