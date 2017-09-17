package com.example.linkzen.sep15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    //ViewGroup rootContainer;
    static Scene screen2, screen3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Log.INFO", "this is called  during the onCreate of 1 st Activity ");

        ViewGroup rootContainer = (ViewGroup) findViewById(R.id.rootContainer1);
        //Scene screen1 = Scene.getSceneForLayout(rootContainer , R.layout.activity_main, this);
        screen2 = Scene.getSceneForLayout(rootContainer , R.layout.activity_main2, this);
        screen3 = Scene.getSceneForLayout(rootContainer , R.layout.activity_main3, this);

       // Toast t1 = Toast.makeText(this , " screen 1 is created ", Toast.LENGTH_LONG);
       // t1.show();

    }

    public void goTo2ndScreen ( View v ) {
        screen2.enter();
    }
    public void goTo3rdScreen ( View v ) {
        screen3.enter();
    }


}
