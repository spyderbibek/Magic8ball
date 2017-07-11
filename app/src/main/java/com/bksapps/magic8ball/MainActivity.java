package com.bksapps.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton=(Button)findViewById(R.id.askButton);
        final ImageView image_ball= (ImageView)findViewById(R.id.image_ball);
        final int[] ballArray={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();
                int number=rand.nextInt(5);
                Log.i("Info","Random Number is: "+ number);
                image_ball.setImageResource(ballArray[number]);
            }
        });
    }
}
