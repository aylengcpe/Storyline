package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part2 extends AppCompatActivity {
private Button button2, button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);
        button2= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart1();
            }

        });

        button5= (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPart3();
            }
        });
    }
    public void openPart1(){
        Animation animation= AnimationUtils.loadAnimation(Part2.this, R.anim.blink_anim);
        button2.startAnimation(animation);
        Intent intent = new Intent(this, Part1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void openPart3(){
        Animation animation= AnimationUtils.loadAnimation(Part2.this, R.anim.blink_anim);
        button5.startAnimation(animation);
        Intent intent = new Intent(this, Part3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
