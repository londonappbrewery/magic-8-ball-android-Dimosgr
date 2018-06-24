package com.londonappbrewery.magiceightball;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*My button that i want to press*/
        final Button askButton = (Button) findViewById(R.id.ask_button);
        /*my image that i have the answer*/
        final ImageView answerImage = (ImageView) findViewById(R.id.answer_Image);
        /*Here is an array with all answers*/
        final int[] answers = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                                R.drawable.ball4, R.drawable.ball5};
        /*Here is my object to create random numbers*/
        final Random rand = new Random();

        /*I want a listener for my button*/
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*in every click i want a new random number*/
                int answer = rand.nextInt(6);
                answerImage.setImageResource(answers[answer]);
            }
        });
    }
}
