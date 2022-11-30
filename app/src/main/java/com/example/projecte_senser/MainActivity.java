package com.example.projecte_senser;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button New_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        New_user = findViewById(R.id.new_user);
        New_user.setOnClickListener(view -> switchActivities());
    }


    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, MenuJava.class);
        startActivity(switchActivityIntent);
    }



}