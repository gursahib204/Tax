package com.example.tax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class splashScreen extends AppCompatActivity {
    private ProgressBar pgsBar;
    private int i = 0;
    private Handler hdlr = new Handler();
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        txtView=(TextView)findViewById(R.id.tView);
        pgsBar=(ProgressBar)findViewById(R.id.pBar);

        pgsBar.setVisibility(View.VISIBLE);
        i = pgsBar.getProgress();
        new Thread(new Runnable() {
            public void run() {
                while (i < 100) {
                    i += 1;
                    // Update the progress bar and display the current value in text view
                    hdlr.post(new Runnable() {
                        public void run() {
                            pgsBar.setProgress(i);
                            txtView.setText(i+"/"+pgsBar.getMax()+"%");
                        }
                    });
                    try {
                        // Sleep for 50 milliseconds for smooth display.
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }  Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        }).start();
    }
}