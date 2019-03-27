package springboot.petclinic.services;

import java.util.Set;

/**
 * Created by max on 2019-03-26
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
