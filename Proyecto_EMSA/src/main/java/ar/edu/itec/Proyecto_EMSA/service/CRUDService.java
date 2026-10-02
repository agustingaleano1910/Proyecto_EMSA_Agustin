package ar.edu.itec.Proyecto_EMSA.service;

import java.util.List;
import java.util.Optional;

public interface CRUDService<T, ID> {
    T save(T entity);
    List<T> findAll();
    Optional<T> findById(ID id);
    void deleteById(ID id);
}
