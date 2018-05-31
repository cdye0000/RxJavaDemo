package com.cdye.rxjava2demo.rxjava;

/**
 * Created by cdy on 2018/5/31.
 */

public interface  Observer<T> {
     void onNext(T t);
     void onError(Throwable e);
     void onComplete();
}
