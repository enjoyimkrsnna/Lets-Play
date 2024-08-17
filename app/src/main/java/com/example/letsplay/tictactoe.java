package com.example.letsplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import io.github.muddz.styleabletoast.StyleableToast;

public class tictactoe extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView display1, display2;
    int flag=0;
    int count=0;
    String playerone="";
    String playertwo="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe);
        init();

    }

    public void init()
    {
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        display1 = findViewById(R.id.txt1);
        display2 = findViewById(R.id.txt2);

        Intent i = getIntent();
        playerone = i.getStringExtra("play1");
        playertwo = i.getStringExtra("play2");

        display1.setText(playerone);
        display2.setText(playertwo);

    }

    public  void check(View v)
    {
        Button clickedbutton = (Button) v;
        String p1 = display1.getText().toString() ;
        String p2 = display2.getText().toString() ;

        if(clickedbutton.getText().toString().equals(""))
        {
            count++;
            if(flag==0)
            {
                clickedbutton.setText("X");
                flag=1;
            }
            else
            {
                clickedbutton.setText("O");
                flag=0;
            }

            if(count>4)
            {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                //condition
                if(b1.equals(b2) && b2.equals(b3) && !b1.equals(""))
                {

                    if(b1=="X")
                    {
                        StyleableToast.makeText(this,"Winner "+p1,R.style.mytoast).show();
                        restart();
                    }
                    else
                    {
                        StyleableToast.makeText(this,"Winner "+p2,R.style.mytoast).show();
                        restart();

                    }

                }else if(b4.equals(b5) && b5.equals(b6) && !b4.equals(""))
                {
                    if(b4=="X")
                    {

                        StyleableToast.makeText(this,"Winner "+p1,R.style.mytoast).show();
                        restart();
                    }
                    else
                    {

                        StyleableToast.makeText(this,"Winner "+p2,R.style.mytoast).show();
                        restart();

                    }

                }
                else if(b7.equals(b8) && b8.equals(b9) && !b7.equals(""))
                {
                    if(b7=="X")
                    {
                        StyleableToast.makeText(this,"Winner " +p1,R.style.mytoast).show();
                        restart();
                    }
                    else
                    {
                        StyleableToast.makeText(this,"Winner "+p2,R.style.mytoast).show();
                        restart();

                    }


                }
                else if(b1.equals(b4) && b4.equals(b7) && !b1.equals(""))
                {
                    if(b1=="X")
                    {
                        StyleableToast.makeText(this,"Winner "+p1,R.style.mytoast).show();
                        restart();
                    }
                    else
                    {
                        StyleableToast.makeText(this,"Winner "+p2,R.style.mytoast).show();
                        restart();

                    }

                }
                else if(b2.equals(b5) && b5.equals(b8) && !b2.equals(""))
                {
                    if(b2=="X")
                    {
                        StyleableToast.makeText(this,"Winner "+p1,R.style.mytoast).show();
                        restart();
                    }
                    else
                    {
                        StyleableToast.makeText(this,"Winner "+p2,R.style.mytoast).show();
                        restart();

                    }
                }
                else if(b3.equals(b6) && b6.equals(b9) && !b3.equals(""))
                {
                    if(b3=="X")
                    {
                        StyleableToast.makeText(this,"Winner "+p1,R.style.mytoast).show();
                        restart();
                    }
                    else
                    {
                        StyleableToast.makeText(this,"Winner "+p2,R.style.mytoast).show();
                        restart();

                    }
                }
                else if(b1.equals(b5) && b5.equals(b9) && !b1.equals(""))
                {
                    if(b1=="X")
                    {
                        StyleableToast.makeText(this,"Winner "+p1,R.style.mytoast).show();
                        restart();
                    }
                    else
                    {
                        StyleableToast.makeText(this,"Winner "+p2,R.style.mytoast).show();
                        restart();

                    }

                }
                else if(b3.equals(b5) && b5.equals(b7) && !b3.equals(""))
                {
                    if(b3=="X")
                    {
                        StyleableToast.makeText(this,"Winner "+p1,R.style.mytoast).show();
                        restart();
                    }
                    else
                    {
                        StyleableToast.makeText(this,"Winner "+p2,R.style.mytoast).show();
                        restart();

                    }
                }
                else if(count==9)
                {
                    StyleableToast.makeText(this,"Match draw ",R.style.mytoast).show();
                    restart();

                }
            }

        }

    }

    public void restart()
    {


        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag =0;
        count =0;

    }
}