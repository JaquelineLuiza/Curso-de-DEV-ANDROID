package com.cursoandroid.quantovocegostadeseries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView imageExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBarId);

        imageExibir = findViewById(R.id.imageExibir);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valorProgesso = progress;

                if(valorProgesso == 1){
                    imageExibir.setImageResource(R.drawable.pouco);
                }
                if(valorProgesso == 2){
                    imageExibir.setImageResource(R.drawable.medio);
                }
                if (valorProgesso == 3){
                    imageExibir.setImageResource(R.drawable.muito);
                }
                if (valorProgesso == 4){
                    imageExibir.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
