package br.com.phddigital.riphe78.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.phddigital.riphe78.adapter.viewholders.CategoriaViewHolder;
import br.com.phddigital.riphe78.domain.Categoria;

public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaViewHolder> {

    private final List<Categoria> list;

    public CategoriaAdapter(@NonNull List<Categoria> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CategoriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(CategoriaViewHolder.R_ID_VIEW,parent,false);

        return new CategoriaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriaViewHolder holder, int position) {
    holder.setValue(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



}
