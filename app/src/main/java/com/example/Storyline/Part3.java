package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part3 extends AppCompatActivity {
private Button button6, button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3);
        button6= (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart2();
            }
        });

        button7= (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart4();
            }
        });
    }
    public void openPart2(){
        Animation animation= AnimationUtils.loadAnimation(Part3.this, R.anim.blink_anim);
        button6.startAnimation(animation);
        Intent intent = new Intent(this, Part2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void openPart4(){
        Animation animation= AnimationUtils.loadAnimation(Part3.this, R.anim.blink_anim);
        button7.startAnimation(animation);
        Intent intent = new Intent (this, Part4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
