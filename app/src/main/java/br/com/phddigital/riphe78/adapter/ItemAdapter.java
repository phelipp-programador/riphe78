package br.com.phddigital.riphe78.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.phddigital.riphe78.adapter.viewholders.ItemViewHolder;
import br.com.phddigital.riphe78.domain.Item;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private final List<Item> list;
    public ItemAdapter(@NonNull List<Item> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(ItemViewHolder.R_ID_VIEW,parent,false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
    holder.setValue(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
