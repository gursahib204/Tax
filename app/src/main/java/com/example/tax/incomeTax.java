package com.example.tax;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class incomeTax extends AppCompatActivity {
    ImageView img1;
    TextView text1,text2;
    EditText edit1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_tax);
        img1=(ImageView)findViewById(R.id.img1);
        text1=(TextView)findViewById(R.id.text1);
        text2=(TextView)findViewById(R.id.text2);
        edit1=(EditText)findViewById(R.id.edit1);
        b1=(Button)findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Integer.parseInt(String.valueOf(edit1.getText()));
                    calculate();
                }
                catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "You have exceeded the Input Limit!", Toast.LENGTH_LONG).show();
                    text2.setText("");
                }
            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void calculate()
    {
        long Total = 0;
        long Tax=0;
        long in= Integer.parseInt(edit1.getText().toString());
        if (in >= 200000 && in < 1000000)
        {
            Tax= (in * 5)/100;
            Total = in + Tax;
        }
        else if(in >= 1000000 && in < 2000000)
        {
            Tax = (in * 10)/100;
            Total = in + Tax;
        }
        else if(in >= 2000000 && in < 3000000)
        {
            Tax= (in * 15)/100;
            Total = in + Tax;
        }
        else if (in >= 3000000 && in < 4000000)
        {
            Tax = (in * 20)/100;
            Total = in + Tax;
        }
        else if(in >= 4000000 && in < 5000000)
        {
            Tax = (in * 25)/100;
            Total = in + Tax;
        }
        else if (in >= 5000000 && in < 7000000)
        {
            Tax = (in * 30)/100;
            Total = in + Tax;
        }
        else if (in >= 7000000 && in < 10000000)
        {
            Tax = (in * 35)/100;
            Total = in + Tax;
        }
        else if (in >= 10000000)
        {
            Tax = (in * 40)/100;
            Total = in + Tax;
        }
        text2.setText("Tax on your income "+edit1.getText()+"= \t"+Tax+"\n \n"+
                "Total Income (Inclusion of Tax) "+"= \t"+Total);
    }
}