package com.cursoandroid.minhasanotacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private ImageView btnSalvar;

    private static final String ARQUIVO = "arquivo_anotacao.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.textoId);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = texto.getText().toString();
                gravarNoArquivo(textoDigitado);
                Toast.makeText(MainActivity.this, "Anotação salva!", Toast.LENGTH_LONG).show();

            }
        });
        //RECUPERAR O QUE FOI GRAVADO
        if ( lerArquivo() != null ){
            texto.setText(lerArquivo());
        }
    }
    private  void gravarNoArquivo(String texto){
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput(ARQUIVO, Context.MODE_PRIVATE));
            outputStreamWriter.write(texto);
            outputStreamWriter.close();

        }catch (IOException e){
            Log.v("MainActivity", e.toString());
        }
    }

    private String lerArquivo(){
        String resultado = "";

        try {
            //ABRIR O ARQUIVO
            InputStream arquivo = openFileInput(ARQUIVO);
            if ( arquivo != null ){
                //LER O ARQUIVO
                InputStreamReader inputStreamReader = new InputStreamReader(arquivo);

                //GERAR BUFFER DO ARQUIVO LIDO
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                //RECUPERAR OS DADOS DO ARQUIVO
                String linhaArquivo = "";

                while ( (linhaArquivo = bufferedReader.readLine()) != null ){

                    resultado += linhaArquivo;
                }
                arquivo.close();

            }
        }catch (IOException e){
            Log.v("MainActivity", e.toString());
        }
        return resultado;
    }
}
