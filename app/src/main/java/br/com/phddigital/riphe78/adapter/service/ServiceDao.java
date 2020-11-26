package br.com.phddigital.riphe78.adapter.service;

import java.util.List;

import br.com.phddigital.riphe78.mvp.MVP;

public interface ServiceDao<T extends MVP.Model> {
    void save(T entity);

    void update(Integer id, T newEntity);

    List<T> select();

    T select(Integer id);

    void delete(Integer id);

}
