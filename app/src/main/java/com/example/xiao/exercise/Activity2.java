package com.example.xiao.exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void onccccclick(View v) {
        Intent secondintent = new Intent(this, EmptyActivity.class);
        startActivity(secondintent);
    }
}
