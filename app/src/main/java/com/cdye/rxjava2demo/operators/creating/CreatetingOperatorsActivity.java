package com.cdye.rxjava2demo.operators.creating;

import android.app.Activity;
import android.util.Log;

import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.ObservableFromCallable;

/**
 * Created by Administrator on 2018/5/27 0027.
 */

/**
 * Observable 被观察者
 * Observer 观察者
 */
public class CreatetingOperatorsActivity extends Activity {

    private static final String TAG = "CreatetingOperatorsActi";

    /**
     * 创建操作符 create
     *  Observable.create 创建Observable
     *  subscribe（...）事件订阅 参数是观察者Observer
     */
    private void createExample(){
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception {
                //这里发送事件
                e.onNext("Hello World !");
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                //这里接收事件
                Log.d(TAG,s+"");

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

    }

    /**
     * 创建操作符 just
     * just 重载方法，参数为1到8个
     * 依次发送1到8个事件
     */
    private void justExample(){
        Observable.just("one","two").subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                //这里接收事件，just中几个参数，这里触发几次
                Log.d(TAG,s+"");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    /**
     * 创建操作符 defer
     * 他会一直等待直到有观察者订阅它，然后它使用Observable工厂方法生成一个Observable。它对每个观察者都这样做，因此尽管每个订阅者都以为自己订阅的是同一个Observable，事实上每个订阅者获取的是它们自己的单独的数据序列。
     */
    private void deferExample(){
        Observable.defer(new Callable<ObservableSource<?>>() {
            @Override
            public ObservableSource<?> call() throws Exception {
                return Observable.just("");
            }
        });
        Observable.fromCallable(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        });
    }

    /**
     * 创建操作符 fromArray
     */
    private void fromExample(){
        Observable.fromArray(new Integer[]{1,2,3}).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer integer) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

    }
}
