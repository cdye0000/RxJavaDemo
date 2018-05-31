package com.cdye.rxjava2demo.rxjava;

/**
 * Created by cdy on 2018/5/31.
 */

public class Observable<T> {
    private ObservableOnSubscribe onSubscribe;

    public Observable(ObservableOnSubscribe onSubscribe) {
        this.onSubscribe = onSubscribe;
    }
    public void subscrible(Observer<?super T> observer){
        onSubscribe.subscribe(observer);
    }
    public static <T> Observable<T> create(ObservableOnSubscribe onSubscribe){
        return new Observable<>(onSubscribe);

    }
}
