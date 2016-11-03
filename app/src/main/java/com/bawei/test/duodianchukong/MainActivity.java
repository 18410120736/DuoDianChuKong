package com.bawei.test.duodianchukong;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class MainActivity extends AppCompatActivity {
    private ZoomImageView zoomImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        zoomImg = (ZoomImageView) findViewById(R.id.image);
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
                R.mipmap.a);
        zoomImg.setImage(bitmap);
    }
}
