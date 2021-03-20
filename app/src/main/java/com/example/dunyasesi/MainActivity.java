package com.example.dunyasesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// login page
public class MainActivity extends AppCompatActivity {

    Button loginButton;
    Button registerButton;
    Button forgotPasswordButton;
    EditText loginEmailEditText;
    EditText loginPasswordEditText;
    SharedPreferences mySharedPref;
    String mySharedPrefFileName = "LOGIN_INFO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);
        loginEmailEditText = findViewById(R.id.emailEditText);

        mySharedPref = getSharedPreferences(mySharedPrefFileName,  Context.MODE_PRIVATE);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (loginEmailEditText.getText().toString().length() != 0) {
                    createNewLoggedInUser(loginEmailEditText.getText().toString(), mySharedPref.edit());
                    final Intent i = new Intent(getApplicationContext(), Explore.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();

        if (isUserLoggedIn(mySharedPref)) {
            final Intent i = new Intent(this, Explore.class);
            startActivity(i);
            finish();
        }

    }

    private void createNewLoggedInUser (String username, SharedPreferences.Editor editor) {
        editor.putString("USERNAME", username);
        editor.commit();
    }

    private boolean isUserLoggedIn (SharedPreferences sharedPreferences) {
        if (sharedPreferences.getString("USERNAME", "").equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
