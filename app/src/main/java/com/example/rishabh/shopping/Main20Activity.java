package com.example.rishabh.shopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main20Activity extends AppCompatActivity {


    String s1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        Intent intent = getIntent();
        s1 = intent.getStringExtra("Website");




        WebView mWebView = (WebView) findViewById(R.id.mWebView);

        mWebView.loadUrl(s1);
    }
}
