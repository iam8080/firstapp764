package com.example.firstapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SigninPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_page);
    }
}