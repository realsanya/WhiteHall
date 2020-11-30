package ru.itis.javalab.repositories.interfaces;

import ru.itis.javalab.models.Review;
import ru.itis.javalab.repositories.interfaces.CrudRepository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface ReviewReposiroty extends CrudRepository<Review, Integer> {
    List<Review> findByUserID(Integer user_id);
}
