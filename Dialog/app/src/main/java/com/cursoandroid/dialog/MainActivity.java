package com.cursoandroid.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button btnDialog;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDialog = findViewById(R.id.btnDialogId);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Criar alert dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //Criar titulo
                dialog.setTitle("Titulo do dialog");

                //Criar mensagem
                dialog.setMessage("Mensagem do dialog");

                dialog.setIcon(android.R.drawable.ic_dialog_alert);
                //Botao negativo
                dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Pressionando botão não", Toast.LENGTH_LONG).show();
                    }
                });

                //Botao positivo
                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Pressionando botão sim", Toast.LENGTH_LONG).show();
                    }
                });

                dialog.create();
                dialog.show();
            }
        });
    }
}
