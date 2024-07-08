package me.dio.service.impl;

import me.dio.domain.model.Account;
import me.dio.domain.repository.AccountRepository;
import me.dio.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account findByNumber(String number) {
        return accountRepository.findByNumber(number);
    }

}
