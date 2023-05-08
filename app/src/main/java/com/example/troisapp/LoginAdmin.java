package com.example.troisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginAdmin extends AppCompatActivity implements View.OnClickListener{
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        login = findViewById(R.id.button_login_admin);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button_login_admin){
            Intent intent = new Intent(LoginAdmin.this, Admin.class);
            startActivity(intent);
        }
    }
}