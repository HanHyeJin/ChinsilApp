package com.example.hyejin.chinsilgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by yeonjin on 2017-04-05.
 */
public class Multi_Room_Make extends AppCompatActivity {

    EditText room_title;
    EditText room_pwd;
    ImageView room_btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_room_make);
    }
}