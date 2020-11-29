package br.com.phddigital.riphe78.domain;

import br.com.phddigital.riphe78.mvp.MVP;
import lombok.Data;

@Data
public class Item implements MVP.Model{
    private Long id;
    private String nome;
    private double valor;
    private String urlImage;
    private Loja loja;


}
