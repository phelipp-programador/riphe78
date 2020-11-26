package br.com.phddigital.riphe78.data;

import java.util.List;

import br.com.phddigital.riphe78.mvp.MVP;

public interface ResourceDao<T extends MVP.Model> {
    void save(T entity);

    void update(Integer id, T newEntity);

    List<T> select();

    void delete(Integer id);
    
}
