package com.example.spiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup_page extends AppCompatActivity {
    public EditText firstName,lastName,EmailAddress,Pass;
    private Button signup;
    String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        firstName=findViewById(R.id.firstName);
        lastName=findViewById(R.id.lastName);
        EmailAddress=findViewById(R.id.emailId);
        Pass=findViewById(R.id.pass);
        signup=findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=EmailAddress.getText().toString();
                password=Pass.getText().toString();
                Toast.makeText(signup_page.this,"Sign Up Successfully Done!!",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(signup_page.this,sign_in.class);
                startActivity(intent);

            }
        });
    }

}