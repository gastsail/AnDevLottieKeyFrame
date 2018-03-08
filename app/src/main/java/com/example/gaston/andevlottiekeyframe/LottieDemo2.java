package com.example.gaston.andevlottiekeyframe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class LottieDemo2 extends AppCompatActivity {

    private LottieAnimationView lottieAnimationView;
    private LottieAnimationView lottieAnimationView1;
    private LottieAnimationView lottieAnimationView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_demo2);

        lottieAnimationView = findViewById(R.id.animation_view);
        lottieAnimationView1 = findViewById(R.id.animation_view2);
        lottieAnimationView2 = findViewById(R.id.animation_view3);

        lottieAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieAnimationView.playAnimation();
            }
        });

        lottieAnimationView1.playAnimation();
        lottieAnimationView2.playAnimation();
    }
}
