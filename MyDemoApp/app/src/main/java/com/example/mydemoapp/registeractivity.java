package com.example.mydemoapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mydemoapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registeractivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    EditText fname, password,email,address,number;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.register);
        btn = findViewById(R.id.register);

        fname =findViewById(R.id.fullname);
        email=findViewById(R.id.emailaddress);
        password=findViewById(R.id.password);
        address=findViewById(R.id.address);
        number=findViewById(R.id.mobilenumber);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                String n = fname.getText().toString();
                String em = email.getText().toString();
                String p = password.getText().toString();
                String ad = address.getText().toString();
                String num = number.getText().toString();

                Intent intent=(new Intent(registeractivity.this,homeactivity.class));
                intent.putExtra("keyfname",n);
                intent.putExtra("keyemail",em);
                intent.putExtra("keypassword",p);
                intent.putExtra("keyaddress",ad);
                intent.putExtra("keynumber",num);

                startActivity(intent);

            }
        });
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
    }
}


