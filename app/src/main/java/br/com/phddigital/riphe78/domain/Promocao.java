package br.com.phddigital.riphe78.domain;

import br.com.phddigital.riphe78.mvp.MVP;
import lombok.Data;

@Data
public class Promocao implements MVP.Model{
    private Integer id;
    private Item item;
    private float descontoPorcent;
    private float descontoValor;
    private float valorTotal;
}
