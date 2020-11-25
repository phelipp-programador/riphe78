package br.com.phddigital.riphe78.domain;

import br.com.phddigital.riphe78.mvp.MVP;
import lombok.Data;

@Data
public class Loja implements MVP.Model{
    private Long id;
    private String nome;
    private String urlLogo;

    private float nota;
    private Categoria categoria;
    private String descricao;
}
