package com.example.arabiclingo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.icu.text.AlphabeticIndex;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class alphaPage extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_page);

        Intent i = getIntent();
        String alphabet = i.getStringExtra("Alphabet");

        if(alphabet.equals("A"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a1);
            ((TextView)findViewById(R.id.transTV)).setText("Alif");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.a));

            ((TextView)findViewById(R.id.nameTV)).setText("Aarnab (Rabbit)");
        }
        else if(alphabet.equals("B"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a2);
            ((TextView)findViewById(R.id.transTV)).setText("Baa");
            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.b));
            ((TextView)findViewById(R.id.nameTV)).setText("BaTTah (Duck)");
        }
        else if(alphabet.equals("C"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a3);
            ((TextView)findViewById(R.id.transTV)).setText("taa");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.c));

            ((TextView)findViewById(R.id.nameTV)).setText("tuffaaHa (Apple)");
        }
        else if(alphabet.equals("D"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a4);
            ((TextView)findViewById(R.id.transTV)).setText("Thaa");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.d));

            ((TextView)findViewById(R.id.nameTV)).setText("Tha'lab (Fox)");
        }
        else if(alphabet.equals("E"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a5);
            ((TextView)findViewById(R.id.transTV)).setText("Jiim");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.e));

            ((TextView)findViewById(R.id.nameTV)).setText("Jamal (Camel)");
        }
        else if(alphabet.equals("F"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a6);
            ((TextView)findViewById(R.id.transTV)).setText("Haa");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.f));

            ((TextView)findViewById(R.id.nameTV)).setText("HiSaan (Horse)");
        }
        else if(alphabet.equals("G"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a7);
            ((TextView)findViewById(R.id.transTV)).setText("Kha");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.g));

            ((TextView)findViewById(R.id.nameTV)).setText("Kharuuf (Sheep)");
        }
        else if(alphabet.equals("H"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a8);
            ((TextView)findViewById(R.id.transTV)).setText("daal");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.h));

            ((TextView)findViewById(R.id.nameTV)).setText("diyk (Rooster)");
        }
        else if(alphabet.equals("I"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a9);
            ((TextView)findViewById(R.id.transTV)).setText("dhaal");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.i));
            ((TextView)findViewById(R.id.nameTV)).setText("dhubaab (Fly)");
        }
        else if(alphabet.equals("J"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a10);
            ((TextView)findViewById(R.id.transTV)).setText("Raa");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.j));

            ((TextView)findViewById(R.id.nameTV)).setText("Raakuun (Racoon)");
        }
        else if(alphabet.equals("K"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a11);
            ((TextView)findViewById(R.id.transTV)).setText("Zaay");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.k));

            ((TextView)findViewById(R.id.nameTV)).setText("Zaraafa (Giraffe)");
        }
        else if(alphabet.equals("L"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a12);
            ((TextView)findViewById(R.id.transTV)).setText("siin");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.l));

            ((TextView)findViewById(R.id.nameTV)).setText("samak (Fish)");
        }
        else if(alphabet.equals("M"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a13);
            ((TextView)findViewById(R.id.transTV)).setText("Shiin");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.m));

            ((TextView)findViewById(R.id.nameTV)).setText("Shams (sun)");
        }
        else if(alphabet.equals("N"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a14);
            ((TextView)findViewById(R.id.transTV)).setText("Saad");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.n));

            ((TextView)findViewById(R.id.nameTV)).setText("Suura (Picture)");
        }
        else if(alphabet.equals("O"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a15);
            ((TextView)findViewById(R.id.transTV)).setText("Daad");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.o));

            ((TextView)findViewById(R.id.nameTV)).setText("Dafda' (Frog)");
        }
        else if(alphabet.equals("P"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a16);
            ((TextView)findViewById(R.id.transTV)).setText("Taa");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.p));

            ((TextView)findViewById(R.id.nameTV)).setText("Tabashiir (Chalk)");
        }
        else if(alphabet.equals("Q"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a17);
            ((TextView)findViewById(R.id.transTV)).setText("Dhaa");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.q));

            ((TextView)findViewById(R.id.nameTV)).setText("Dhabii (Fallow Deer)");
        }
        else if(alphabet.equals("R"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a18);
            ((TextView)findViewById(R.id.transTV)).setText("Ayn");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.r));

            ((TextView)findViewById(R.id.nameTV)).setText("'inaba (Grapes)");
        }
        else if(alphabet.equals("S"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a19);
            ((TextView)findViewById(R.id.transTV)).setText("Ghayn");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.s));

            ((TextView)findViewById(R.id.nameTV)).setText("Ghazaal (Gazelle)");
        }
        else if(alphabet.equals("T"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a20);
            ((TextView)findViewById(R.id.transTV)).setText("Faa");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.t));

            ((TextView)findViewById(R.id.nameTV)).setText("Faraasha (Butterfly)");
        }
        else if(alphabet.equals("U"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a21);
            ((TextView)findViewById(R.id.transTV)).setText("Qaaf");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.u));

            ((TextView)findViewById(R.id.nameTV)).setText("Qamar (Moon)");
        }
        else if(alphabet.equals("V"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a22);
            ((TextView)findViewById(R.id.transTV)).setText("Kaaf");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.v));

            ((TextView)findViewById(R.id.nameTV)).setText("Kitaab (Book)");
        }
        else if(alphabet.equals("W"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a23);
            ((TextView)findViewById(R.id.transTV)).setText("Laam");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.w));

            ((TextView)findViewById(R.id.nameTV)).setText("Laymuun (Lemon)");
        }
        else if(alphabet.equals("X"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a24);
            ((TextView)findViewById(R.id.transTV)).setText("Miim");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.x));

            ((TextView)findViewById(R.id.nameTV)).setText("MiftaaH (Key)");
        }
        if(alphabet.equals("Y"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a25);
            ((TextView)findViewById(R.id.transTV)).setText("Nuun");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.y));

            ((TextView)findViewById(R.id.nameTV)).setText("Naar (Fire)");
        }
        else if(alphabet.equals("Z"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a26);
            ((TextView)findViewById(R.id.transTV)).setText("Waaw");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.z));

            ((TextView)findViewById(R.id.nameTV)).setText("Warda (Rose)");
        }
      /*  else if(alphabet.equals("ه"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a27);
            ((TextView)findViewById(R.id.transTV)).setText("haa");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.ha));

            ((TextView)findViewById(R.id.nameTV)).setText("hilaal (Crescent Moon)");
        }
        else if(alphabet.equals("ء"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a28);
            ((TextView)findViewById(R.id.transTV)).setText("Hmzaa");

            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.hamzaa));

            ((TextView)findViewById(R.id.nameTV)).setText("Aasad (Lion)");
        }
        else if(alphabet.equals("ي"))
        {
            ((TextView)findViewById(R.id.alphaTV)).setText(R.string.a29);
            ((TextView)findViewById(R.id.transTV)).setText("Yaa");
            ImageView imageview= (ImageView)findViewById(R.id.imgView);
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.smallyaa));

            ((TextView)findViewById(R.id.nameTV)).setText("Yad (Hand)");
        }*/
    }

}