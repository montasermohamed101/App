package com.example.myapplicationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView=findViewById(R.id.number);


        String number=getIntent().getStringExtra("number");

        textView.setText("+02 "+number);
       // textView.setText(number);


    }
}