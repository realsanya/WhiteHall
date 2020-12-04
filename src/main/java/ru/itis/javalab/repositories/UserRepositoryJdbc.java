package ru.itis.javalab.repositories;

import ru.itis.javalab.models.Review;
import ru.itis.javalab.models.User;
import ru.itis.javalab.repositories.interfaces.UserRepository;

import java.util.List;

public class UserRepositoryJdbc implements UserRepository {
    //TODO
    @Override
    public void save(User entity) {

    }

    @Override
    public void delete(User entity) {

    }


    @Override
    public User findById(Integer integer) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
