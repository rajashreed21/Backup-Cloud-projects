package com.example.logintodoapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.logintodoapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registeractivity extends AppCompatActivity implements View.OnClickListener   {
    private Button btn;
    EditText username, Email, password;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        username = findViewById(R.id.user_name);
        Email = findViewById(R.id.email_id);
        password = findViewById(R.id.pass_word);
        btn = findViewById(R.id.register_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        String fullname = username.getText().toString().trim();
        String email = Email.getText().toString().trim();
        String pass = password.getText().toString().trim();

        Intent intent = new Intent(registeractivity.this, addtask.class);

        intent.putExtra("keyfname",fullname);
        intent.putExtra("keyemail",email);
        intent.putExtra("keypassword",pass);

        if (TextUtils.isEmpty(fullname)) {
            Toast.makeText(this, "Please enter your full name", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();


        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
    }
}








