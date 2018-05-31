package com.cdye.rxjava2demo.rxjava;

/**
 * Created by cdy on 2018/5/31.
 */

public class OperatorMap<T,R> implements Operator<T,R> {
    @Override
    public Observer<? extends R> apply(Observer<? super T> observer) {
        return null;
    }
    class MapSubscrible<T,R> implements Observer<T> {

        @Override
        public void onNext(T t) {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onComplete() {

        }
    }
}
