package com.cursoandroid.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private  RadioButton radioButtonEscolhido;
    private Button btnEscolher;
    private TextView txtExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupComida);
        btnEscolher = findViewById(R.id.btnEscolher);
        txtExibir = findViewById(R.id.txtExibir);

        btnEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();
                if (idRadioButtonEscolhido > 0){
                    radioButtonEscolhido = findViewById(idRadioButtonEscolhido);

                    txtExibir.setText(radioButtonEscolhido.getText());
                }
            }
        });
    }
}
