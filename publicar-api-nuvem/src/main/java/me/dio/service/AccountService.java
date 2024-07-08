package me.dio.service;

import me.dio.domain.model.Account;

public interface AccountService {
    
    Account findByNumber(String number);

}
