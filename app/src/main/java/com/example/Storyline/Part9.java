package com.example.Storyline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Part9 extends AppCompatActivity {
private Button button18, button19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part9);
        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPart8();
            }
        });

        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPart10();
            }
        });
    }
        public void openPart8(){
        Animation animation= AnimationUtils.loadAnimation(Part9.this, R.anim.blink_anim);
        button18.startAnimation(animation);
        Intent intent = new Intent(this, Part8.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
        public void openPart10(){
        Animation animation= AnimationUtils.loadAnimation(Part9.this, R.anim.blink_anim);
        button19.startAnimation(animation);
        Intent intent = new Intent (this, Part10.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
        }
}
