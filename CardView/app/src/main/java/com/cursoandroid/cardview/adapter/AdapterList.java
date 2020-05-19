package com.cursoandroid.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.model.Postagem;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.MyViewHolder> {

    private List<Postagem> postagems;
    public AdapterList(List<Postagem> p) {
        this.postagems = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);
        return  new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = postagems.get( position );
        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imagePostagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagePostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.txtNome);
            textPostagem = itemView.findViewById(R.id.txtPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
