package com.example.mydemoapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class homeactivity extends AppCompatActivity {

    TextView fname,email, password,address,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        fname = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.pass);
        address = findViewById(R.id.addr);
        number = findViewById(R.id.number);

        String n=getIntent().getStringExtra("keyfname");
        String em=getIntent().getStringExtra("keyemail");
        String p=getIntent().getStringExtra("keypassword");
        String ad=getIntent().getStringExtra("keyaddress");
        String num=getIntent().getStringExtra("keynumber");

        fname.setText(n);
        email.setText(em);
        password.setText(p);
        address.setText(ad);
        number.setText(num);


    }
}