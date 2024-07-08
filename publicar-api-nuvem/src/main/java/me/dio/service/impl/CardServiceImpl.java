package me.dio.service.impl;

import me.dio.domain.model.Card;
import me.dio.domain.repository.CardRepository;
import me.dio.service.CardService;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card findByNumber(String number) {
        return cardRepository.findByNumber(number);
    }

}
