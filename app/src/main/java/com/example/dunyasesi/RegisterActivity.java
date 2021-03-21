package com.example.dunyasesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// This is the registration page
public class RegisterActivity extends AppCompatActivity {

    Button registerButton;
    Button loginButton;
    Button forgotPasswordButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerButton = findViewById(R.id.registerButton);
        loginButton = findViewById(R.id.loginButton);
        forgotPasswordButton = findViewById(R.id.forgotPasswordButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToLoginPage();
            }
        });

        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               navigateToForgotPasswordPage();
            }
        });

    }

    private void navigateToLoginPage () {

        final Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();

    }

    private void navigateToForgotPasswordPage () {

        final Intent i = new Intent(getApplicationContext(), ForgotPasswordActivity.class);
        startActivity(i);
        finish();

    }
}
