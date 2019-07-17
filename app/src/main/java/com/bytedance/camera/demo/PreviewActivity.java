package com.bytedance.camera.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class PreviewActivity extends AppCompatActivity {

    VideoView videoView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        videoView = findViewById(R.id.vv);
        videoView.setVideoPath(getIntent().getStringExtra("path"));
        videoView.start();

    }
}
