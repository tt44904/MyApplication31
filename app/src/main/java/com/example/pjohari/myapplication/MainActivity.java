package com.example.pjohari.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Test case","Test Message 1");
        Log.i("Test case","Test Message 2");
        Log.i("Test case","Test Message 2");

    }
}
