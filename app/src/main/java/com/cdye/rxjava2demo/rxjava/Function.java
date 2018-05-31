package com.cdye.rxjava2demo.rxjava;

/**
 * Created by cdy on 2018/5/31.
 */

public interface Function<T,R> {

    /**
     * T类型转换成R类型
     * @param t
     * @return
     */
    R apply(T t);
}
