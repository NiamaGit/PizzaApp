package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class ActivitySplash extends AppCompatActivity {

    ImageView logo,splashImg,appn;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        logo = findViewById(R.id.logo);
        splashImg = findViewById(R.id.imageView4);
        lottieAnimationView = findViewById(R.id.lottie);
        appn = findViewById(R.id.imageView5);
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    splashImg.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
                    logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
                    lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
                    appn.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
                    Intent intent = new Intent(ActivitySplash.this, ListPizzaActivity.class);
                    startActivity(intent);
                    ActivitySplash.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();






    }
}