package com.dreamx.gitandgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("local changes");
        System.out.println("Experimental branch");
        System.out.println("Hello from your friend");
        System.out.println("Second hello");
    }
}