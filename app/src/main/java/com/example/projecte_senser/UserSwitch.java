package com.example.projecte_senser;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UserSwitch extends AppCompatActivity {
    Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        login_button = findViewById(R.id.recycler);
        login_button.setOnClickListener(view -> switchActivities());
    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, RecyclerViewMain.class);
        startActivity(switchActivityIntent);
    }
}