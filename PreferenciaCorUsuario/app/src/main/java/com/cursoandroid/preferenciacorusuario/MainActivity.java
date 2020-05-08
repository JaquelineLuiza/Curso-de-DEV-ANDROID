package com.cursoandroid.preferenciacorusuario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonSelecionado;
    private Button btnSalvar;
    private ConstraintLayout layout;

    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGorupId);
        btnSalvar = findViewById(R.id.btnSalvar);
        layout = findViewById(R.id.layoutId);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();
                radioButtonSelecionado = findViewById(idRadioButtonEscolhido);

                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                String corEscolhida = radioButtonSelecionado.getText().toString();
                editor.putString("corEscolhida", corEscolhida);
                editor.commit();

                setBackground(corEscolhida);

                radioButtonSelecionado.getText().toString();

            }
        });
        //RECUPERAR A COR SALVA
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        if ( sharedPreferences.contains("corEscolhida") ){
            String corRecuperada = sharedPreferences.getString("corEscolhida", "Laranja");
            setBackground(corRecuperada);
        }
    }

    private void setBackground(String cor){
        if ( cor.equals("Azul") ){
            layout.setBackgroundColor(Color.parseColor("#3919FF"));
        }else if( cor.equals("Laranja") ){
            layout.setBackgroundColor(Color.parseColor("#F25C05"));
        }else if( cor.equals("Verde") ){
            layout.setBackgroundColor(Color.parseColor("#ABD904"));
        }
    }
}
