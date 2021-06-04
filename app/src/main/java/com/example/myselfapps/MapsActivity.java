package com.example.myselfapps;
//Nama : Rizky Muslimin
//NIM : 10118002
//Kelas : IF-1
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.myselfapps.R;

public class MapsActivity extends AppCompatActivity {
    WebView mWebview;
    WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://goo.gl/maps/sEgKUbuVVJbKWgu7A"));
        startActivity(intent);
    }
}
