package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    Iterable<User> findAll();

    User create(User userToCreate);

    void delete(Long id);
    
    // User update(User userToUpdate);

}
