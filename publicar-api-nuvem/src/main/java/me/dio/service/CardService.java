package me.dio.service;

import me.dio.domain.model.Card;

public interface CardService {
    
    Card findByNumber(String number);

}
