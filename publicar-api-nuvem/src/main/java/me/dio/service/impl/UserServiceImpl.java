package me.dio.service.impl;

import me.dio.domain.model.Account;
import me.dio.domain.model.Card;
import me.dio.domain.model.User;
import me.dio.domain.repository.AccountRepository;
import me.dio.domain.repository.CardRepository;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        if (userRepository.existsByCardNumber(userToCreate.getCard().getNumber())) {
            throw new IllegalArgumentException("This Card number already exists.");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public void delete(Long id) {
        User userToDelete = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        userRepository.delete(userToDelete);
    }
    
}
