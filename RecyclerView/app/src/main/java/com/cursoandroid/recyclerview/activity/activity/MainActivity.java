package com.cursoandroid.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.cursoandroid.recyclerview.R;
import com.cursoandroid.recyclerview.activity.RecyclerItemClickListener;
import com.cursoandroid.recyclerview.activity.adapter.Adapter;
import com.cursoandroid.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.layoutId);

        //Listagem de Filmes
        this.criarFilmes();
        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Configurar Reyclerview
        RecyclerView.LayoutManager layoutManager  = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        //Evento de clique
        recyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Filme filme = listaFilmes.get(position);
                            Toast.makeText(getApplicationContext(), "Você clicou rápido!"+ filme.getTituloFilme(), Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            Toast.makeText(getApplicationContext(), "Você clicou longo!", Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        }
                    }
            )
        );
    }

    public void criarFilmes(){
        Filme filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
        filme = new Filme("Homem Aranha de volta ao lar", "Ficção", "2017");
        this.listaFilmes.add( filme );
    }
}
