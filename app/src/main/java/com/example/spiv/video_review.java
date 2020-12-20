package com.example.spiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class video_review extends AppCompatActivity {
    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_review);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mywebView = findViewById(R.id.webviewId);
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://www.youtube.com/watch?v=dmVvJ08NB7U");
        mywebView.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack())
        {
            mywebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}