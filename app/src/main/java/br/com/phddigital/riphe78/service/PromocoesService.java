package br.com.phddigital.riphe78.service;

import java.util.List;

import br.com.phddigital.riphe78.data.CategoriaResources;
import br.com.phddigital.riphe78.domain.Categoria;
import br.com.phddigital.riphe78.domain.Item;

public class PromocoesService implements ServiceDao<Item> {
    private CategoriaResources categoriaResources;

    @Override
    public void save(Item entity) {

    }

    @Override
    public void update(Integer id, Item newEntity) {

    }

    @Override
    public List<Item> select() {
        return null;
    }

    @Override
    public Item select(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
