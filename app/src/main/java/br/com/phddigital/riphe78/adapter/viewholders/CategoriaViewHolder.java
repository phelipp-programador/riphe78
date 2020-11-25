package br.com.phddigital.riphe78.adapter.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import br.com.phddigital.riphe78.R;
import br.com.phddigital.riphe78.domain.Categoria;

public  class CategoriaViewHolder extends RecyclerView.ViewHolder {
    public TextView nome;
    public ImageView image;
    public static final int R_ID_VIEW=R.layout.layout_card_categoria;;
    public CategoriaViewHolder(@NonNull View view) {
        super(view);

        nome = view.findViewById(R.id.txt_nome);
        image = view.findViewById(R.id.iv_banner);
    }

    public void setValue(Categoria entity) {
        nome.setText(entity.getNome());
        Picasso.get().load(entity.getUrlImage()).into(image);

    }
}
