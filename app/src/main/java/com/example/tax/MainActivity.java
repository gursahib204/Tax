package com.example.tax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView indexImage;
    TextView indexText,indexText2;
    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        indexImage=(ImageView)findViewById(R.id.indexImage);
        indexText=(TextView)findViewById(R.id.indexText);
        indexText2=(TextView)findViewById(R.id.indexText2);
        login=(Button)findViewById(R.id.login);
        signup=(Button)findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),loginPage.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),signUp.class);
                startActivity(intent);
            }
        });
    }

}