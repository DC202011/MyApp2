package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {  //继承BaseActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //跳转到activity_main布局
        Button forceOffline = (Button) findViewById(R.id.force_offline);//监听点击
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.myapp.FORCE_OFFLINE");//这只是一条广播，需要有接收才能下线，而且com.example.myapp位置要填对了
                sendBroadcast(intent);//广播他
            }
        });
    }

}
