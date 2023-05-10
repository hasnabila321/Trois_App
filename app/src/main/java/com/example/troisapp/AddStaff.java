package com.example.troisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddStaff extends AppCompatActivity implements View.OnClickListener{
    Button registerStaff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_staff);

        registerStaff = findViewById(R.id.button_register_staff);

        registerStaff.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button_register_staff){
            Intent intent = new Intent(AddStaff.this, Admin.class);
            startActivity(intent);
        }
    }
}