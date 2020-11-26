package br.com.phddigital.riphe78.service;

import java.util.List;

import br.com.phddigital.riphe78.data.CategoriaResources;
import br.com.phddigital.riphe78.domain.Categoria;

public class CategoriaService implements ServiceDao<Categoria> {
    private CategoriaResources categoriaResources;
    @Override
    public void save(Categoria entity) {

    }

    @Override
    public void update(Integer id, Categoria newEntity) {

    }

    @Override
    public List<Categoria> select() {
        return null;
    }

    @Override
    public Categoria select(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
