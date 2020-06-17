package com.example.snakes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int[] myDice = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,

    };

    public void rollTapped(View view) {

        Random ran = new Random();
        int randomNumber = ran.nextInt(6);
        Log.i("Random", "Random number is" + randomNumber);


            ImageView Dice6 = (ImageView) findViewById(R.id.Dice);
            Dice6.setImageResource(myDice[randomNumber]);






        }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

    }
