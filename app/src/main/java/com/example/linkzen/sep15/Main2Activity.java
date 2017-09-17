package com.example.linkzen.sep15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.i("Log.INFO", "this is called  during the onCreate of 2 rnd Activity ");

        Toast t2 = Toast.makeText(this , " screen 2 is created ", Toast.LENGTH_LONG);
        t2.show();
    }
}
