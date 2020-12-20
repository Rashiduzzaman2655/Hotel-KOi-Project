package com.example.spiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class sign_in extends AppCompatActivity implements View.OnClickListener{
    private EditText username, password;
    private Button login;
    private ImageView facebook;
    private TextView forgetPass,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        facebook=findViewById(R.id.facebook);
        login=findViewById(R.id.loginButton);
        forgetPass=findViewById(R.id.forgetPass);
        forgetPass.setOnClickListener(this);
        signup=findViewById(R.id.signup);
        signup.setOnClickListener(this);
        login.setOnClickListener(this);
        facebook.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.loginButton)
        {
            String user=username.getText().toString();
            String pass=password.getText().toString();
            if (user.equals("shakil@gmail.com")&&pass.equals("1234"))
            {
                Intent intent=new Intent(sign_in.this,list_hotel.class);
                startActivity(intent);
                finish();

            }
            else
            {
                Toast.makeText(sign_in.this,"Please Try again",Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId()==R.id.signup)
        {
            Intent intent=new Intent(sign_in.this,signup_page.class);
            startActivity(intent);

        }
        if (view.getId()==R.id.facebook)
        {
            Toast.makeText(sign_in.this,"Shakil",Toast.LENGTH_SHORT).show();
        }

    }
}