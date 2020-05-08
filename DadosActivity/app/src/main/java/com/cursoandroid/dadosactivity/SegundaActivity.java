package com.cursoandroid.dadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView txtPadrao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtPadrao = findViewById(R.id.txtPadrao);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String txtPassado = extra.getString("nome");
            txtPadrao.setText(txtPassado);
        }
    }
}
