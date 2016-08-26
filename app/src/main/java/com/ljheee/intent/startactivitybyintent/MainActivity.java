package com.ljheee.intent.startactivitybyintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
    }

    /**
     * 显式意图传递
     * @param view
     */
    public void doExplicit(View view) {
        String info = editText.getText().toString();
        if(!info.equals("")){
            editText.setText("");
        }

        //显式启动NextActivity.class活动
        Intent intent = new Intent(getApplicationContext(),NextActivity.class);

        intent.putExtra("KEY_INFO",info);

        startActivity(intent);
    }


    /**
     * 隐式意图传递
     * @param view
     */
    public void doImplicit(View view) {

        String info = editText.getText().toString();
        if(!info.equals("")){
            editText.setText("");
        }
        Intent intent = new Intent();
        intent.setAction("com.ljheee.intent.DATA_CONVERT");

        intent.putExtra("KEY_INFO",info);
        startActivity(intent);

    }
}
