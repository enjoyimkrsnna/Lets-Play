package com.example.letsplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class gettingplayers extends AppCompatActivity {
    EditText pl1, pl2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gettingplayers);
        pl1 = findViewById(R.id.player1);
        pl2 = findViewById(R.id.player2);
    }

    public void startgame(View view)
    {

        String player1 = pl1.getText().toString();
        String player2 = pl2.getText().toString();
        if(player1.equals("") || player2.equals(""))
        {
            Toast.makeText(this, "Please! Enter Player Names ", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent i = new Intent(this,tictactoe.class);
            i.putExtra("play1",player1);
            i.putExtra("play2",player2);
            startActivity(i);

        }



    }
}