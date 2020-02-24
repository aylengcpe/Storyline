package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part8 extends AppCompatActivity {
private Button button16, button17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part8);
        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPart7();
            }
        });

        button17= (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPart9();
            }
        });
    }
    public void openPart7(){
        Animation animation= AnimationUtils.loadAnimation(Part8.this, R.anim.blink_anim);
        button16.startAnimation(animation);
        Intent intent = new Intent(this, Part7.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void openPart9(){
        Animation animation= AnimationUtils.loadAnimation(Part8.this, R.anim.blink_anim);
        button17.startAnimation(animation);
        Intent intent = new Intent(this, Part9.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
