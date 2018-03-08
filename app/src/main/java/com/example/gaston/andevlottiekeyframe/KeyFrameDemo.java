package com.example.gaston.andevlottiekeyframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        try {
            PonerAnimacion();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void PonerAnimacion() throws IOException {

        InputStream stream = getResources().getAssets().open("sample_file");
        KFImage kfImage = KFImageDeserializer.deserialize(stream);


        KeyframesDrawable kfDrawable = new KeyframesDrawableBuilder().withImage(kfImage).build();

        ImageView imageView = findViewById(R.id.some_image_view);
        imageView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        imageView.setImageDrawable(kfDrawable);
        imageView.setImageAlpha(0);


        kfDrawable.startAnimation();
    }
}
