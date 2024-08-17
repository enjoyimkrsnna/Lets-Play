package com.example.letsplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tictactoecard(View v)
    {

        Intent i = new Intent(getApplicationContext(),gettingplayers.class);
        startActivity(i);

    }

    public void flyingfishgame(View v)
    {
        Intent i = new Intent(getApplicationContext(),flyingfishmain.class);
        startActivity(i);


    }

    public void instaclicked(View v)
    {
        gotourl("https://www.instagram.com/imkrsnna/");
    }

    public void linkedinclicked(View v)
    {
        gotourl("https://www.linkedin.com/in/imkrsnna/");
    }

    public void gotourl(String s)
    {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);

    }
}