package com.example.jimmy.emojitalk;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    MediaPlayer emotion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void speak(View view) {

        switch (view.getId()) {

            case R.id.happy:
                emotion = MediaPlayer.create(this, R.raw.happy);
                emotion.start();
                break;

            case R.id.sad:
                emotion = MediaPlayer.create(this, R.raw.sad);
                emotion.start();
                break;

            case R.id.angry:
                emotion = MediaPlayer.create(this, R.raw.angry);
                emotion.start();
                break;

            case R.id.frustrated:
                emotion = MediaPlayer.create(this, R.raw.frustrated);
                emotion.start();
                break;

            case R.id.scared:
                emotion = MediaPlayer.create(this, R.raw.scared);
                emotion.start();
                break;

            case R.id.love:
                emotion = MediaPlayer.create(this, R.raw.love);
                emotion.start();
                break;


            default:
                break;

        }
    }
}
