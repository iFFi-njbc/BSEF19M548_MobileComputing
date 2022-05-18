package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView counter;
    String no1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = findViewById(R.id.textView);


    }

    public void clicked(View view)
    {
        int no = Integer.parseInt(counter.getText().toString());
        no = no +1;
        no1 = String.valueOf(no);
        counter.setText(no1);
    }
}