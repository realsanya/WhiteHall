package ru.itis.javalab.repositories;

import ru.itis.javalab.models.Review;
import ru.itis.javalab.repositories.interfaces.ReviewReposiroty;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class ReviewRepositoryJdbc implements ReviewReposiroty {
    //TODO


    @Override
    public List<Review> findByUserID(Integer user_id) {
        return null;
    }

    @Override
    public void save(Review entity) {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void update(Review entity) {

    }

    @Override
    public Review findById(Integer integer) {
        return null;
    }

    @Override
    public List<Review> findAll() {
        return null;
    }
}
