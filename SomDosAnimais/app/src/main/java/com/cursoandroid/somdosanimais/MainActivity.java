package com.cursoandroid.somdosanimais;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = findViewById(R.id.imageViewCao);
        gato = findViewById(R.id.imageViewGato);
        leao = findViewById(R.id.imageViewLeao);
        macaco = findViewById(R.id.imageViewMacaco);
        ovelha = findViewById(R.id.imageViewOvelha);
        vaca = findViewById(R.id.imageViewVaca);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch ( v.getId() ){
            case R.id.imageViewCao:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                tocarSom();
                break;
            case R.id.imageViewGato:
                            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                            tocarSom();
                            break;
            case R.id.imageViewLeao:
                            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                            tocarSom();
                            break;
            case R.id.imageViewMacaco:
                            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                            tocarSom();
                            break;
            case R.id.imageViewOvelha:
                            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                            tocarSom();
                            break;
            case R.id.imageViewVaca:
                            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                            tocarSom();
                            break;

        }

    }

    public void tocarSom(){
        if ( mediaPlayer != null ){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if ( mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
