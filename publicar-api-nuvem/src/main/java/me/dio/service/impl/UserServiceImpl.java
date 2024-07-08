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
    private final AccountRepository accountRepository;
    private final CardRepository cardRepository;

    public UserServiceImpl(UserRepository userRepository, AccountRepository accountRepository, CardRepository cardRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
        this.cardRepository = cardRepository;
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

    @Override
    public User update(User userToUpdate) {

        if (!userRepository.existsById(userToUpdate.getId())) {
            throw new NoSuchElementException();
        }

        Account account = accountRepository.findByNumber(userToUpdate.getAccount().getNumber());
        Card card = cardRepository.findByNumber(userToUpdate.getCard().getNumber());

        if (account != null) {
            userToUpdate.getAccount().setId(account.getId());
        }

        if (card != null) {
            userToUpdate.getCard().setId(card.getId());
        }

//        userRepository.save(userToUpdate);
        return userToUpdate;

    }
    
}
