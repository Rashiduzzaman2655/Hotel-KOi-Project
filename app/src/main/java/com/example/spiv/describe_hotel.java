package com.example.spiv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class describe_hotel extends AppCompatActivity implements View.OnClickListener {

    private TextView text;
    private Button button,confirm_button;
    private DatePickerDialog datePickerDialog;
    private Button webviewid,reviewId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_hotel);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        text=findViewById(R.id.text);
        button=findViewById(R.id.button);
        webviewid=findViewById(R.id.webviewId);
        reviewId=findViewById(R.id.reviewId);
        confirm_button=findViewById(R.id.confirm_button);
        confirm_button.setOnClickListener(this);
        reviewId.setOnClickListener(this);
        button.setOnClickListener(this);
        webviewid.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button)
        {
            DatePicker datePicker=new DatePicker(describe_hotel.this);
            int day=datePicker.getDayOfMonth();
            int month=(datePicker.getMonth())+1;
            int year=datePicker.getYear();

            datePickerDialog=new DatePickerDialog(describe_hotel.this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                            text.setText(i2+"/"+(i1+1)+"/"+i);
                        }
                    },day,month,year);
            datePickerDialog.show();

        }
        if (view.getId()==R.id.confirm_button)
        {
            Toast.makeText(describe_hotel.this,"Your Information saved",Toast.LENGTH_SHORT).show();
        }
        if (view.getId()==R.id.webviewId)
        {
            Intent intent=new Intent(describe_hotel.this,webview.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.reviewId)
        {
            Intent intent=new Intent(describe_hotel.this,video_review.class);
            startActivity(intent);
        }


    }
}