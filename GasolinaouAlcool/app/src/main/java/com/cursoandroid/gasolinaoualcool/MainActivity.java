package com.cursoandroid.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Localizar os componentes na tela
        precoAlcool = findViewById(R.id.precoAlcoolId);
        precoGasolina = findViewById(R.id.precoGasolinaId);
        botaoVerificar = findViewById(R.id.botaoVerificarId);
        resultado = findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar os valores digitados
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //Converter valores de string para numericos
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                if( textoPrecoAlcool.isEmpty() || textoPrecoGasolina.isEmpty()){
                    resultado.setText("Nenhum valor passado para conversão!!");
                }else {
                    Double resultadoConversao = valorAlcool/valorGasolina;

                    if( resultadoConversao >=0.7){
                        //Gasolina compensa mais
                        resultado.setText("É melhor utilizar gasolina.");
                    }else{
                        resultado.setText("É melhor utilizar àlcool.");
                    }
                }
            }
        });
    }
}
