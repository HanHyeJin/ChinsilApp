package com.example.hyejin.chinsilgame;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by hyejin on 2017-03-28.
 * Desc : 스플래시(시작화면)
 */

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();    // 액티비티 종료
            }
        };
        handler.sendEmptyMessageDelayed(0, 3000);    // ms, 3초후 종료시킴
    }

}
