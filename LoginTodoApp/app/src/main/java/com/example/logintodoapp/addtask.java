package com.example.logintodoapp;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class addtask extends AppCompatActivity {

    private static final String TAG="addtask";

    private String API_URL;
    private EditText todotitle,tododesc,todotime;

    private Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_task);

        todotitle = findViewById(R.id.title);
        tododesc = findViewById(R.id.desc);
        todotime = findViewById(R.id.time);
        addButton = findViewById(R.id.add_btn);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtodo();
            }
        });
    }

    private  void addtodo(){
        String title= todotitle.getText().toString();


        String desc = tododesc.getText().toString();

        String time = todotime.getText().toString();

        JSONObject userData = new JSONObject();

        try {

            userData.put("title", title);

            userData.put("desc", desc);

            userData.put("time", time);

        } catch (JSONException e) {

            e.printStackTrace();

        }

        // Send POST request to API endpoint

        new RegisterAsyncTask().execute(userData.toString());

    }

    private class RegisterAsyncTask extends AsyncTask<String, Void, String> {

        @SuppressLint("RestrictedApi")
        @Override

        protected String doInBackground(String... params) {

            String jsonData = params[0];

            HttpURLConnection connection = null;

            StringBuilder response = new StringBuilder();

            try {

                URL url = new URL(API_URL);
                API_URL="https://demoproj-ymdz.onrender.comcreatetodo";

                connection = (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("POST");

                connection.setRequestProperty("Content-Type", "application/json");

                connection.setDoOutput(true);

                BufferedOutputStream outputStream = new BufferedOutputStream(connection.getOutputStream());

                outputStream.write(jsonData.getBytes());

                outputStream.flush();

                outputStream.close();

                // Read response

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                String line;

                while ((line = reader.readLine()) != null) {

                    response.append(line);

                }

                reader.close();

            } catch (IOException e) {

                Log.e(TAG, "Error sending POST request: " + e.getMessage());

            } finally {

                if (connection != null) {

                    connection.disconnect();

                }

            }

            return response.toString();

        }

        @Override

        protected void onPostExecute(String result) {

            if (!result.isEmpty()) {

                Toast.makeText(addtask.this, "Task added successfully", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(addtask.this, todoactivity.class);

                startActivity(intent);

            } else {

                Toast.makeText(addtask.this, "Task failed to add", Toast.LENGTH_SHORT).show();

            }

            Intent intent = new Intent(addtask.this, todoactivity.class);

            startActivity(intent);

            finish();

        }

    }

}

