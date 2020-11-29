package br.com.phddigital.riphe78.service;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.data.CategoriaResources;
import br.com.phddigital.riphe78.domain.Item;

public class DestaqueService implements ServiceDao<Item> {
    private CategoriaResources categoriaResources;

    @Override
    public Optional<Item> save(Item entity) {

        return null;
    }

    @Override
    public Optional<Item> update(Integer id, Item newEntity) {

        return null;
    }

    @Override
    public Optional<List<Item>> select() {
        return null;
    }

    @Override
    public Optional<Item> select(Integer id) {
        return null;
    }

    @Override
    public Optional<Boolean> delete(Integer id) {

        return null;
    }
}
