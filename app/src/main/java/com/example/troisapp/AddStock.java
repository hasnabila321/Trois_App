package com.example.troisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddStock extends AppCompatActivity implements View.OnClickListener{
    Button addStock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_stock);

        addStock = findViewById(R.id.button_stock);

        addStock.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button_stock){
            Intent intent = new Intent(AddStock.this, Admin.class);
            startActivity(intent);
        }
    }
}