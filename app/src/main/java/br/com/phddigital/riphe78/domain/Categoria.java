package br.com.phddigital.riphe78.domain;

import br.com.phddigital.riphe78.mvp.MVP;
import lombok.Data;

@Data
public class Categoria implements MVP.Model{
    private Integer id;
    private String nome;
    private String urlImage;
}
