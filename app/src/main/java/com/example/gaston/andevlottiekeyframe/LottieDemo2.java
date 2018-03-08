package com.example.gaston.andevlottiekeyframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.airbnb.lottie.LottieAnimationView;

public class LottieDemo2 extends AppCompatActivity {

    private LottieAnimationView mAnimationView, mAnimationView2,mAnimationView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_demo2);

        mAnimationView = findViewById(R.id.animation_view);
        mAnimationView2 = findViewById(R.id.animation_view2);
        mAnimationView3 = findViewById(R.id.animation_view3);


        mAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnimationView.playAnimation();


            }
        });

        mAnimationView2.playAnimation();
        mAnimationView3.playAnimation();
    }
}
