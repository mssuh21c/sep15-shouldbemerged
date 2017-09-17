package com.example.linkzen.sep15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.i("Log.INFO", "this is called  during the onCreate of 3 rd  Activity ");
        //Toast t3 = Toast.makeText(this , " screen 3 is created ", Toast.LENGTH_LONG);
        //t3.show();
    }

    public void goTo2ndScreen ( View v ) {
        MainActivity.screen2.enter();
    }
}
