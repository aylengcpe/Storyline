package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part10 extends AppCompatActivity {
private Button button20, button21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part10);
        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPart9();
            }
        });

        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart11();
            }
        });
    }
        public void openPart9(){
            Animation animation= AnimationUtils.loadAnimation(Part10.this, R.anim.blink_anim);
            button20.startAnimation(animation);
            Intent intent = new Intent(this, Part9.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
        }

        public void openPart11(){
        Animation animation= AnimationUtils.loadAnimation(Part10.this, R.anim.blink_anim);
        button21.startAnimation(animation);
        Intent intent = new Intent (this, Part11.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
        }
    }

