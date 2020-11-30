package ru.itis.javalab.repositories.interfaces;


import ru.itis.javalab.models.Review;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, ID> {
    void save(T entity);

    void delete(ID id);

    void update(T entity);

    T findById(ID id);

    List<Review> findAll();

}
