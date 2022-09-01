package com.example.tax;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {
    ImageView loginImage;
    EditText username,password;
    Button loginButton;
    TextView shamica;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        loginImage=(ImageView)findViewById(R.id.loginImage);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        loginButton=(Button)findViewById(R.id.loginButton);
        shamica=(TextView)findViewById(R.id.shamica);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = username.getText().toString();
                String str1 = password.getText().toString();
                if (str.equals("user1") && str1.equals("pass1")) {
                    Intent intent = new Intent(getApplicationContext(), cardView.class);

                    intent.putExtra("user", str);
                    intent.putExtra("pwd", str1);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
                } else if (str.equals("user2") && str1.equals("pass2")) {
                    Intent intent = new Intent(getApplicationContext(), cardView.class);

                    intent.putExtra("user", str);
                    intent.putExtra("pwd", str1);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
                } else if (!str.equals("user1") && str1.equals("pass1")) {
                    Toast.makeText(getApplicationContext(), "Invalid Username", Toast.LENGTH_LONG).show();
                } else if (str.equals("user1") && !str1.equals("pass1")) {
                    Toast.makeText(getApplicationContext(), "Invalid Password", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username/Password", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}


   // Intent intent = new Intent(getApplicationContext(),cardView.class);
    //startActivity(intent);