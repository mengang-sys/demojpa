package com.my.demojpa.emnu;
@FunctionalInterface
public interface IFunction<P,R> {

    public R change(P p);
}
