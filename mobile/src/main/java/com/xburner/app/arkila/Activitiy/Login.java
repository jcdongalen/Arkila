package com.xburner.app.arkila.Activitiy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xburner.app.arkila.R;

public class Login extends AppCompatActivity  implements View.OnClickListener{

    Button btnSignIn, btnCreateAcccount, btnForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnCreateAcccount = (Button) findViewById(R.id.btnCreateAccount);

        btnSignIn.setOnClickListener(this);
        btnCreateAcccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSignIn:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btnCreateAccount:
                startActivity(new Intent(this, SignUp.class));
                break;
        }
    }
}
