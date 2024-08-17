package com.example.letsplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gameoveractivity extends AppCompatActivity {

    Button startagain ,homepage;
    TextView displayscore;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameoveractivity);

        score =  getIntent().getExtras().get("score").toString();

        startagain = (Button) findViewById(R.id.play_again_btn);
        homepage = (Button) findViewById(R.id.main_back_btn);
        displayscore = findViewById(R.id.textView);

        startagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gameoveractivity.this,flyingfishmain.class);
                startActivity(i);
            }
        });

        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gameoveractivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        displayscore.setText("Total Score: "+ score);
    }
}