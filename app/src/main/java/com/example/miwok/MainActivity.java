package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On clicking Number Activity
        // NumberClickListner onClick = new NumberClickListner();
        // TextView numbers = (TextView) findViewById(R.id.numbers);
        // numbers.setOnClickListener(onClick);

        // Alternate to above
         TextView numbers = (TextView) findViewById(R.id.numbers);
         numbers.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this , NumberActivity.class);
                startActivity(numberIntent);
             }
         });

         // for colors
        TextView color = (TextView) findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this , ColorsActivity.class);
                startActivity(colorIntent);
            }
        });

        // for family
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this , FamilyActivity.class);
                startActivity(familyIntent);
            }
        });


        // for phrases
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this , PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }

}