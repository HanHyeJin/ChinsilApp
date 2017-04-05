package com.example.hyejin.chinsilgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by hyejin on 2017-04-02.
 */
public class Multi_List extends AppCompatActivity {
    ImageView list_button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_list);





        list_button = (ImageView) findViewById(R.id.list_button);
        list_button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Multi_Room_Make.class);
                startActivity(intent);
            }

        });
    }
}