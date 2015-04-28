package com.example.aaa.jpushdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import cn.jpush.android.api.JPushInterface;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化JPush
        JPushInterface.init(getApplicationContext());
        //开启debug模式
        JPushInterface.setDebugMode(false);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //用于统计用户的活跃度
        JPushInterface.onResume(getApplicationContext());
    }

    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(getApplicationContext());
    }
}
