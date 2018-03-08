package com.example.gaston.andevlottiekeyframe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.facebook.keyframes.KeyframesDrawable;
import com.facebook.keyframes.KeyframesDrawableBuilder;
import com.facebook.keyframes.deserializers.KFImageDeserializer;
import com.facebook.keyframes.model.KFImage;

import java.io.IOException;
import java.io.InputStream;

public class KeyFrameDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_frame_demo);

        startAnimation();
    }


    private void startAnimation() {
        InputStream stream;
        KFImage kfImage;

        try {
            stream = getResources().getAssets().open("sample_file");
            kfImage = KFImageDeserializer.deserialize(stream);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        KeyframesDrawable kfDrawable = new KeyframesDrawableBuilder().withImage(kfImage).build();

        ImageView imageView = findViewById(R.id.some_image_view);
        imageView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        imageView.setImageDrawable(kfDrawable);
        imageView.setImageAlpha(0);

        kfDrawable.startAnimation();
    }
}
