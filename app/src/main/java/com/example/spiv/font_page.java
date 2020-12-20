package com.example.spiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class font_page extends AppCompatActivity {
    private ProgressBar progressBar;
    int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font_page);
        progressBar=findViewById(R.id.progressBar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

                dowork();
                Startapp();
            }
        });
        thread.start();
    }
    public void dowork()
    {
        for (progress=20;progress<=100;progress=progress+20)
        {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void Startapp()
    {
        Intent intent=new Intent(font_page.this,sign_in.class);
        startActivity(intent);
        finish();
    }
}