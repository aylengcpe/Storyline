package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part7 extends AppCompatActivity {
private Button button14, button15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part7);
        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPart6();
            }
        });
        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart8();
            }
        });
    }
        public void openPart6(){
            Animation animation= AnimationUtils.loadAnimation(Part7.this, R.anim.blink_anim);
            button14.startAnimation(animation);
            Intent intent = new Intent(this, Part6.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
        }

        public void openPart8(){
        Animation animation= AnimationUtils.loadAnimation(Part7.this, R.anim.blink_anim);
        button15.startAnimation(animation);
        Intent intent = new Intent (this, Part8.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
        }
    }

