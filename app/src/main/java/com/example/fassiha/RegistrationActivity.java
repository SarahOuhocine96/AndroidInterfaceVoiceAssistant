package com.example.fassiha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void register(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void logIn(View view){
        Intent intent = new Intent(this, LogInActivity.class);
        startActivity(intent);
    }
}