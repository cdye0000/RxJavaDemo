package com.cdye.rxjava2demo.rxjava;

/**
 * Created by cdy on 2018/5/31.
 */

public interface Operator<T,R> extends Function<Observer<?super T>,Observer<?extends R>> {
}
