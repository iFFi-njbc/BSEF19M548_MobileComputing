package com.example.arabiclingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListAlpha extends AppCompatActivity {

    ListView listAlphaLV;
    String selectedFromList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_alpha);

        listAlphaLV = (ListView)findViewById(R.id.listAlphaLV);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add("G");
        arrayList.add("H");
        arrayList.add("I");
        arrayList.add("J");
        arrayList.add("K");
        arrayList.add("L");
        arrayList.add("M");
        arrayList.add("N");
        arrayList.add("O");
        arrayList.add("P");
        arrayList.add("Q");
        arrayList.add("R");
        arrayList.add("S");
        arrayList.add("T");
        arrayList.add("U");
        arrayList.add("V");
        arrayList.add("W");
        arrayList.add("X");
        arrayList.add("Y");
        arrayList.add("Z");


        ArrayAdapter arrayAdap = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listAlphaLV.setAdapter(arrayAdap);

        listAlphaLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedFromList = (String) (listAlphaLV.getItemAtPosition(i));
                launchAlphaPage(selectedFromList);
            }
        });

    }

    public void launchAlphaPage(String s)
    {
        Intent in = new Intent(this, alphaPage.class);
        in.putExtra("Alphabet", s);
        startActivity(in);
    }
}