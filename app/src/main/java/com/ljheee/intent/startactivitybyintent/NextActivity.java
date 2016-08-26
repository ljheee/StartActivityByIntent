package com.ljheee.intent.startactivitybyintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 接收传递的数据
 */
public class NextActivity extends AppCompatActivity {

    TextView textViewShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        textViewShow = (TextView) findViewById(R.id.textView_show);

        Intent intent = getIntent();
        String info = intent.getStringExtra("KEY_INFO");

        textViewShow.setText(info);
    }
}
