package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part4 extends AppCompatActivity {
private Button button8, button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4);
        button8= (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPart3();
            }
        });

        button9= (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart5();
            }
        });
    }
    public void openPart3(){
        Animation animation= AnimationUtils.loadAnimation(Part4.this, R.anim.blink_anim);
        button8.startAnimation(animation);
        Intent intent = new Intent(this, Part3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void openPart5() {
        Animation animation= AnimationUtils.loadAnimation(Part4.this, R.anim.blink_anim);
        button9.startAnimation(animation);
        Intent intent = new Intent (this, Part5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
