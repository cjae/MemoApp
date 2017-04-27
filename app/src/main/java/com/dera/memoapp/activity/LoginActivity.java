package com.dera.memoapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.dera.memoapp.R;
import com.dera.memoapp.util.SessionManager;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLinkToRegister = (Button) findViewById(R.id.btnLinkToRegisterScreen);
        // Link to Register Screen
        btnLinkToRegister.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        RegisterActivity.class);
                startActivity(i);
            }
        });

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        // Link to Register Screen
        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                SessionManager.createUserLogin(LoginActivity.this);
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        });
    }

}
