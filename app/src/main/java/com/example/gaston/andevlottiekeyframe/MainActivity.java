package com.example.gaston.andevlottiekeyframe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLottie = findViewById(R.id.btnDemoLottie);
        btnLottie.setOnClickListener(this);
        Button btnKeyFrame = findViewById(R.id.btnDemoKeyframe);
        btnKeyFrame.setOnClickListener(this);
        Button btnLottie2 = findViewById(R.id.btnDemoLottie2);
        btnLottie2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDemoLottie:
                navigateToActivity(LottieDemo.class);
                break;
            case R.id.btnDemoKeyframe:
                navigateToActivity(KeyFrameDemo.class);
                break;
            case R.id.btnDemoLottie2:
                navigateToActivity(LottieDemo2.class);
                break;
        }
    }

    private void navigateToActivity(Class activity) {
        startActivity(new Intent(this, activity));
    }
}
