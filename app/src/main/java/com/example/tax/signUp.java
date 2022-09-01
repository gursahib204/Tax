package com.example.tax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class signUp extends AppCompatActivity {
    ImageView signupImage;
    EditText username,password,contact,email;
    Button signupbutton;
    TextView shamica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signupImage = (ImageView)findViewById(R.id.signupImage);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        contact=(EditText)findViewById(R.id.contact);
        email=(EditText)findViewById(R.id.email);
        signupbutton=(Button)findViewById(R.id.signupbutton);
        shamica=(TextView)findViewById(R.id.shamica);

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),loginPage.class);
                startActivity(intent);
            }
        });
    }
}