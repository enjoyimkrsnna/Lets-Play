package com.example.letsplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashactivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);

        Thread thread = new Thread()
        {
            @Override
            public void run() {
               try {
                   sleep(3000);
               }catch(Exception e)
               {
                   e.printStackTrace();
               }
               finally {
                   Intent i = new Intent(splashactivity.this,MainActivity.class);
                   startActivity(i);
               }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}