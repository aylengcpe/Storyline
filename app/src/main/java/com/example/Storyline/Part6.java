package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part6 extends AppCompatActivity {
private Button button12, button13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part6);
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart5();
            }
        });
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart7();
            }
        });
    }

    public void openPart5(){
        Animation animation= AnimationUtils.loadAnimation(Part6.this, R.anim.blink_anim);
        button12.startAnimation(animation);
        Intent intent = new Intent(this, Part5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void openPart7(){
        Animation animation= AnimationUtils.loadAnimation(Part6.this, R.anim.blink_anim);
        button13.startAnimation(animation);
        Intent intent = new Intent(this, Part7.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
