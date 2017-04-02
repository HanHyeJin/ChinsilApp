package com.example.hyejin.chinsilgame;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
/**
 * Desc : 싱글/멀티모드
 * Created by hyejin on 2017-04-02.
 */
public class MenuActivity extends AppCompatActivity {
    ImageView singleBtn;
    ImageView multiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        singleBtn = (ImageView) findViewById(R.id.singlebtn);
        multiBtn = (ImageView) findViewById(R.id.multibtn);

        singleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SinglePlayActivity.class);
                startActivity(intent);
            }
        });
        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Multi_List.class);
                startActivity(intent);
            }
        });

    }

}
