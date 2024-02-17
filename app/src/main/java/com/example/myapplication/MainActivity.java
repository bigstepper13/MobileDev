package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
        Toast.makeText(this, "onCreate", duration).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
        Toast.makeText(this, "onStart", duration).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "onStop");
        Toast.makeText(this, "onStop", duration).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy");
        Toast.makeText(this, "onDestroy", duration).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "onPause");
        Toast.makeText(this, "onPause", duration).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "onResume", duration).show();
    }

}