package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part11 extends AppCompatActivity {
    private Button button22, button23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part11);
        button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPart10();
            }
        });

        button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart12();
            }
        });
    }
            public void openPart10(){
                Animation animation= AnimationUtils.loadAnimation(Part11.this, R.anim.blink_anim);
                button22.startAnimation(animation);
                Intent intent = new Intent(this, Part10.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }

            public void openPart12(){
                Animation animation= AnimationUtils.loadAnimation(Part11.this, R.anim.blink_anim);
                button23.startAnimation(animation);
                Intent intent = new Intent(this, Part12.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }
}
