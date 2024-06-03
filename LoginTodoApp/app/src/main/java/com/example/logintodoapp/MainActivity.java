package com.example.logintodoapp;

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

import com.example.logintodoapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    EditText email, pass;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.login_btn);
        btn.setOnClickListener(e -> {
            String nt = email.getText().toString();
            String pt = pass.getText().toString();

            if (nt.equals("raji@gmail.com") && pt.equals("guna07")) {
                // logged in successfully
                Toast.makeText(MainActivity.this, "Logged in Successfully", Toast.LENGTH_LONG).show();

                startActivity(new Intent(MainActivity.this, registeractivity.class));// Navigate to a new Page
            } else {
                Toast.makeText(MainActivity.this, "Incorrect Credentials", Toast.LENGTH_LONG).show();
            }
        });
        email = findViewById(R.id.emailid);
        pass = findViewById(R.id.password);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

    }
}