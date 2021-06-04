package com.example.myselfapps;
//Nama : Rizky Muslimin
//NIM : 10118002
//Kelas : IF-1

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.myselfapps.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, Slider.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
