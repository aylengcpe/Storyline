package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part5 extends AppCompatActivity {
private Button button10, button11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part5);
        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart4();
            }
        });

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart6();
            }
        });

    }
    public void openPart4(){
        Animation animation= AnimationUtils.loadAnimation(Part5.this, R.anim.blink_anim);
        button10.startAnimation(animation);
        Intent intent = new Intent(this, Part4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void openPart6(){
        Animation animation= AnimationUtils.loadAnimation(Part5.this, R.anim.blink_anim);
        button11.startAnimation(animation);
        Intent intent = new Intent(this, Part6.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
