package com.cursoandroid.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaItens;
    private String[] itens =
            {
              "Angra dos Reis", "Caldas Novas",
              "Campos do Jordão", "Costa de Sauipe",
              "Ilhéus", "Porto Seguro", "Rio de Janeiro", "Diamantina",
              "Ouro Preto", "Campo Grande", "Santiago del Chile", "Zurique",
                "Angra dos Reis", "Caldas Novas",
                "Campos do Jordão", "Costa de Sauipe",
                "Ilhéus", "Porto Seguro", "Rio de Janeiro", "Diamantina",
                "Ouro Preto", "Campo Grande", "Santiago del Chile", "Zurique"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );
        listaItens.setAdapter( adapter );
        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int posicao = position;
                String valorClicado = listaItens.getItemAtPosition( posicao ).toString();
                Toast.makeText(getApplicationContext(), valorClicado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
