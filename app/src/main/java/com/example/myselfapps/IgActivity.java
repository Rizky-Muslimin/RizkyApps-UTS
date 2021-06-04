package com.example.myselfapps;
//Nama : Rizky Muslimin
//NIM : 10118002
//Kelas : IF-1

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.myselfapps.R;

public class IgActivity extends AppCompatActivity {
    WebView mWebview;
    WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ig);

        mWebview = (WebView)findViewById(R.id.wv_ig);

        mWebSettings = mWebview.getSettings();
        mWebview.setWebViewClient(new WebViewClient());
        mWebview.loadUrl("https://www.instagram.com/riskimuslimin/");

    }
}
