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

public class Mainactivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    EditText name, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.login_btn);
        btn.setOnClickListener(e -> {
            String nt = name.getText().toString();
            String pt = pass.getText().toString();

            if (nt.equals("rajashree") && pt.equals("guna07")) {
                // logged in successfully
                Toast.makeText(Mainactivity.this, "Logged in Successfully", Toast.LENGTH_LONG).show();

                startActivity(new Intent(Mainactivity.this, registeractivity.class));// Navigate to a new Page
            } else {
                Toast.makeText(Mainactivity.this, "Incorrect Credentials", Toast.LENGTH_LONG).show();
            }
        });
        name = findViewById(R.id.username);
        pass = findViewById(R.id.password);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

    }
}