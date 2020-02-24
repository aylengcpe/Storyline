package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part1 extends AppCompatActivity {
private Button button4, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part1);
        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                openPart2();
            }

        });

    }
    public void openMainActivity(){
        Animation animation= AnimationUtils.loadAnimation(Part1.this, R.anim.blink_anim);
        button4.startAnimation(animation);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void openPart2(){
        Animation animation= AnimationUtils.loadAnimation(Part1.this, R.anim.blink_anim);
        button3.startAnimation(animation);
        Intent intent = new Intent(this, Part2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

}
