package com.cursoandroid.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTocar;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTocar = findViewById(R.id.btnTocarId);
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.musica);

        btnTocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( mediaPlayer.isPlaying() ){
                    pausarMusica();
                }else{
                    tocarMusica();
                }
            }
        });
    }

    private  void tocarMusica(){
        if ( mediaPlayer != null ){
            mediaPlayer.start();
            btnTocar.setText("Pausar");
        }
    }

    private void pausarMusica(){
        if ( mediaPlayer != null ){
            mediaPlayer.stop();
            btnTocar.setText("Tocar");
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
