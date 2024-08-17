package com.example.letsplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class flyingfishmain extends AppCompatActivity {

    private  flyingfishview gameview;
    private Handler handler = new Handler();
    private  final static long interval =30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameview = new flyingfishview(this);
        setContentView(gameview);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        gameview.invalidate();
                    }
                });
            }
        },0,interval);
    }
}