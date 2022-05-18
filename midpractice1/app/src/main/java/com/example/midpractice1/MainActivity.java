package com.example.midpractice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnDate, btnTime;
    int counter=0;
    TextView tv;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDate = findViewById(R.id.button2);
         btnTime = findViewById(R.id.button1);
         tv = findViewById(R.id.textView1);
         checkBox = findViewById(R.id.checkBox);

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("counter", counter);
                startActivity(i);

            }
        });

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;
                tv.setText(String.valueOf(counter));
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked() == true)
                {
                    tv.setText("CHECKBOx IS CHECKED");
                }
            }
        });
    }
}