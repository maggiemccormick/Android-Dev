package com.mccormick.madcowmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private Button playButton;
    private Button pauseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        beginPlayer();
    }

    private void beginPlayer(){
        mediaPlayer = MediaPlayer.create(this, R.raw.cow_mad_x);
        playButton = (Button) findViewById(R.id.playBtn);
        pauseButton = (Button) findViewById(R.id.pauseBtn);
    }

    public void playMusic(View view){
        mediaPlayer.start();
    }

    public void pauseMusic(View view){
        mediaPlayer.pause();
    }
}