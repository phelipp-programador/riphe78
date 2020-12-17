package br.com.phddigital.riphe78.domain;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.mvp.MVP;
import lombok.Data;

@Data
public class ResultPesquisa implements MVP.Model{
    private Optional<List<Item>> item;
    private Optional<List<Loja>> loja;
}
