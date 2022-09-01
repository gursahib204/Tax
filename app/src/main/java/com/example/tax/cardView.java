package com.example.tax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class cardView extends AppCompatActivity implements View.OnClickListener {
ImageButton imagebutton;
    public CardView card1,card2,card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        imagebutton=(ImageButton)findViewById(R.id.imagebutton);
        card1=(CardView)findViewById(R.id.blog1);
        card2=(CardView)findViewById(R.id.blog2);
        card3=(CardView)findViewById(R.id.taxcalc);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),blogone.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),blogtwo.class);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),taxcalculator.class);
                startActivity(intent);
            }
        });

        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}