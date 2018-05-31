package com.cdye.rxjava2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.cdye.rxjava2demo.rxjava.Observable;
import com.cdye.rxjava2demo.rxjava.ObservableOnSubscribe;
import com.cdye.rxjava2demo.rxjava.Observer;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "rxjava";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
