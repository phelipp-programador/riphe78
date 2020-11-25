package br.com.phddigital.riphe78.adapter.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import br.com.phddigital.riphe78.R;
import br.com.phddigital.riphe78.domain.Categoria;
import br.com.phddigital.riphe78.domain.Loja;

public class LojaViewHolder extends RecyclerView.ViewHolder {

    public static final int R_ID_VIEW = R.layout.layout_card_loja;
    public TextView nome;
    public TextView nota;
    public TextView categoria;
    public TextView descricao;
    public ImageView logo;

    public LojaViewHolder(@NonNull View view) {
        super(view);
        nome = view.findViewById(R.id.txt_nome);
        nota = view.findViewById(R.id.txt_nota);
        categoria = view.findViewById(R.id.txt_categoria);
        descricao = view.findViewById(R.id.txt_descricao);
        logo = view.findViewById(R.id.iv_logo);
    }

    public void setValue(Loja entity) {
        nome.setText(entity.getNome());
        nota.setText(String.valueOf(entity.getNota()));
        categoria.setText(entity.getCategoria().getNome());
        descricao.setText(entity.getDescricao());
        Picasso.get().load(entity.getUrlLogo()).into(logo);

    }


}
