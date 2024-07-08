package me.dio.domain.dto;

import java.math.BigDecimal;

import me.dio.domain.model.Account;

public class AccountDTO {

    // private Long id;
    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;

    // Construtores, getters e setters

    public AccountDTO(Account account) {
        // this.id = account.getId();
        this.number = account.getNumber();
        this.agency = account.getAgency();
        this.balance = account.getBalance();
        this.limit = account.getLimit();
    }

    public String getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

}
