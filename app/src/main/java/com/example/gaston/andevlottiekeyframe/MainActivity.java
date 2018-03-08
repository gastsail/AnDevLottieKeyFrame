package com.example.gaston.andevlottiekeyframe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnLottie,mBtnKeyFrame,mBtnLottie2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLottie = findViewById(R.id.btnDemoLottie);
        mBtnLottie.setOnClickListener(this);
        mBtnKeyFrame = findViewById(R.id.btnDemoKeyframe);
        mBtnKeyFrame.setOnClickListener(this);
        mBtnLottie2 = findViewById(R.id.btnDemoLottie2);
        mBtnLottie2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnDemoLottie:
                Intent lottieClass = new Intent(MainActivity.this,LottieDemo.class);
                startActivity(lottieClass);

              break;

            case R.id.btnDemoKeyframe:
                Intent keyFrameClass = new Intent(MainActivity.this,KeyFrameDemo.class);
                startActivity(keyFrameClass);

                break;

            case R.id.btnDemoLottie2:
                Intent lottieClass2 = new Intent(MainActivity.this,LottieDemo2.class);
                startActivity(lottieClass2);

        }

    }
}
