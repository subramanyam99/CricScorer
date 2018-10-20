package com.example.subramanyam.cricscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView show_score,show_one,show_two,show_three,show_four,show_six,show_wide;
    private Button   b_one,b_two,b_three,b_four,b_six,b_wide,b_reset;
    private  int score=0,one=0,two=0,three=0,four=0,six=0,wide=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_score = findViewById(R.id.text_score);
        show_one = findViewById(R.id.text_1);
        show_two = findViewById(R.id.text_2);
        show_three = findViewById(R.id.text_3);
        show_four = findViewById(R.id.text_4);
        show_six = findViewById(R.id.text_6);
        show_wide = findViewById(R.id.text_wide);

        b_one = findViewById(R.id.button_1);
        b_two=findViewById(R.id.button_2);
        b_three=findViewById(R.id.button_3);
        b_four=findViewById(R.id.button_4);
        b_six=findViewById(R.id.button_6);
        b_wide=findViewById(R.id.button_wide);
        b_reset=findViewById(R.id.button_reset);



        b_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                show_score.setText(score+"");
                one++;
                show_one.setText(one+"");
            }
        });


        b_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 2;
                show_score.setText(score+"");
                two++;
                show_two.setText(two+"");


            }
        });

        b_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 3;
                show_score.setText(score+"");
                three++;
                show_three.setText(three+"");

            }
        });

        b_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score += 4;
                show_score.setText(score+"");
                four++;
                show_four.setText(four+"");

            }
        });
        b_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "WooHoo It's a SIX ", Toast.LENGTH_SHORT).show();
                score += 6;
                show_score.setText(score+"");
                six++;
                show_six.setText(six+"");

            }
        });
        b_wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                show_score.setText(score+"");
                wide++;
                show_wide.setText(wide+"");

            }
        });


        b_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "INNINGS COMPLETED", Toast.LENGTH_SHORT).show();
                score =0;
                show_score.setText(score+"");
                one =0;three=0;two=0;four=0;six=0;wide=0;
                show_one.setText(one+"");
                show_two.setText(two+"");
                show_three.setText(three+"");
                show_four.setText(four+"");
                show_six.setText(six+"");
                show_wide.setText(wide+"");


            }
        });






















    }
}
