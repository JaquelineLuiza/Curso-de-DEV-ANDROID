package com.cursoandroid.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxCao;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;

    private Button btnMostrar;
    private TextView txtExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCao = findViewById(R.id.checkBoxCao);
        checkBoxGato = findViewById(R.id.checkBoxGato);
        checkBoxPapagaio = findViewById(R.id.checkBoxPapagaio);

        btnMostrar = findViewById(R.id.btnMostrar);

        txtExibir = findViewById(R.id.txtExibir);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemSelecionado = "";
                itemSelecionado +=  "Item: " + checkBoxCao.getText() + " Status: " + checkBoxCao.isChecked();
                itemSelecionado += "\n" + "Item: " + checkBoxGato.getText() + " Status: " + checkBoxGato.isChecked();
                itemSelecionado += "\n" + "Item: " + checkBoxPapagaio.getText() + " Status: " + checkBoxPapagaio.isChecked();


                txtExibir.setText(itemSelecionado);
            }
        });


    }
}
