package com.cursoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.adapter.AdapterList;
import com.cursoandroid.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Postagem> postagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerPostagem);

        //Listagem de Postagens
        //this.criarPostagem();

        //Configurar o Adapter

        //Definir layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        //recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        //Define o adapter
        this.preparaPostagem();
        AdapterList adapterList = new AdapterList( postagem );
        recyclerView.setAdapter(adapterList);
    }
    public void preparaPostagem(){
        Postagem p = new Postagem("Jaqueline Luiza Araújo Leite", "Minha postagem de hoje galera", R.drawable.post);
        this.postagem.add(p);
        p = new Postagem("João Vitor Gomes Silva", "Minha postagem de hoje galera", R.drawable.post);
        this.postagem.add(p);
        p = new Postagem("Jaqueline Luiza Araújo Leite", "Minha postagem de hoje galera", R.drawable.post);
        this.postagem.add(p);
        p = new Postagem("Jaqueline Luiza Araújo Leite", "Minha postagem de hoje galera", R.drawable.post);
        this.postagem.add(p);

    }
}
