package br.com.phddigital.riphe78.service;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.mvp.MVP;

public interface ServiceDao<T extends MVP.Model> {
    Optional<T> save(T entity);

    Optional<T> update(Integer id, T newEntity);

    Optional<List<T>> select();

    Optional<T> select(Integer id);

    Optional<Boolean> delete(Integer id);

}
