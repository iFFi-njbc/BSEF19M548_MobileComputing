package com.example.midpractice1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv2 = findViewById(R.id.textView1);

        if(getIntent() != null && getIntent().hasExtra("counter"))
        {
            int counter2 = getIntent().getIntExtra("counter",  0);
            tv2.setText("Hellow User ! " + counter2);
        }

    }
}