package com.example.tax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class taxcalculator extends AppCompatActivity {

    Button incometaxcalc,emicalc;
    ImageView logo;
    TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxcalculator);
        incometaxcalc=(Button)findViewById(R.id.incometaxcalc);
        emicalc=(Button)findViewById(R.id.emicalc);
        logo=(ImageView)findViewById(R.id.logo);
        text1=(TextView)findViewById(R.id.text1);

        incometaxcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),incomeTax.class);
                startActivity(intent);
            }
        });

        emicalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),emicalc.class);
                startActivity(intent);
            }
        });
    }
}