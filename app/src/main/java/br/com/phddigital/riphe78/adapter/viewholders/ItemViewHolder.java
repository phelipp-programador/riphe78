package br.com.phddigital.riphe78.adapter.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.text.NumberFormat;

import br.com.phddigital.riphe78.R;
import br.com.phddigital.riphe78.domain.Categoria;
import br.com.phddigital.riphe78.domain.Item;

public  class ItemViewHolder extends RecyclerView.ViewHolder {

    public  TextView nome;
    public  TextView loja;
    public  TextView valor;
    public  ImageView image;
    public static final int R_ID_VIEW=R.layout.layout_card_item;


    public ItemViewHolder(@NonNull View view) {
        super(view);
        nome = view.findViewById(R.id.txt_nome);
        loja = view.findViewById(R.id.txt_loja);
        valor = view.findViewById(R.id.txt_valor);
        image = view.findViewById(R.id.iv_banner);
    }

    public void setValue(Item entity) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        nome.setText(entity.getNome());
        loja.setText(entity.getLoja().getNome());
        valor.setText(format.format(entity.getValor()));
        Picasso.get().load(entity.getUrlImage()).into(image);

    }

}
