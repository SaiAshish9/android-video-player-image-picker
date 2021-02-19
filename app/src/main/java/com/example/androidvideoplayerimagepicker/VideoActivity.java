package com.example.androidvideoplayerimagepicker;

import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView myVideoView = (VideoView) findViewById(R.id.videoView);
        myVideoView.setVideoPath("https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4");
//        https only
        myVideoView.start();

    }
}