package br.com.phddigital.riphe78.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.phddigital.riphe78.adapter.viewholders.LojaViewHolder;
import br.com.phddigital.riphe78.domain.Loja;

public class LojaAdapter extends RecyclerView.Adapter<LojaViewHolder> {

    private final List<Loja> list;

    public LojaAdapter(@NonNull List<Loja> list) {

        this.list = list;
    }

    @NonNull
    @Override
    public LojaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(LojaViewHolder.R_ID_VIEW,parent,false);
        return new LojaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LojaViewHolder holder, int position) {
        holder.setValue(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
