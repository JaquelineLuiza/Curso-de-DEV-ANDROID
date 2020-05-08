package com.cursoandroid.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNome;
    private Button salvar;
    private TextView exibir;

    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.editTextNome);
        salvar = findViewById(R.id.btnSalvar);
        exibir = findViewById(R.id.textViewExibir);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if ( txtNome.getText().toString().equals("") ){
                    Toast.makeText(MainActivity.this, "Por favor preencher o nome!", Toast.LENGTH_LONG).show();
                }else{
                    editor.putString("nome", txtNome.getText().toString());
                    editor.commit();
                    exibir.setText("Olá, " + txtNome.getText().toString());
                }
            }
        });
        //RECUPERAR OS DADOS SALVOS
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        if ( sharedPreferences.contains("nome") ){
            String nomeUsuario = sharedPreferences.getString("nome", "Usuário não definido");
            exibir.setText("Olá, " + nomeUsuario);
        }else{
            exibir.setText("Olá, usuário não definido");
        }
    }
}
