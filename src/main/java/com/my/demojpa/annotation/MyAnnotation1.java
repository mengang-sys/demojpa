package com.my.demojpa.annotation;

public @interface MyAnnotation1 {

    String value() default "注解信息" ;

    int count() default 0;


}
