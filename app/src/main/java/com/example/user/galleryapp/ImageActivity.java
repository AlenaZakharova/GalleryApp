package com.example.user.galleryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class ImageActivity extends AppCompatActivity {

    public static final String EXTRA_SPACE_PHOTO = "ImageActivity.SPACE_PHOTO";
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mImageView = (ImageView) findViewById(R.id.image);
        ImageData imageData = getIntent().getParcelableExtra(EXTRA_SPACE_PHOTO);

        Glide.with(this)
                .load(imageData.getUrl())
                .asBitmap()
                .error(R.drawable.ic_error)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(mImageView);
    }
}


