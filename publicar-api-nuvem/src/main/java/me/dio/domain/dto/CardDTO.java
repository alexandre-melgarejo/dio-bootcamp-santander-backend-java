package me.dio.domain.dto;

import java.math.BigDecimal;

import me.dio.domain.model.Card;

public class CardDTO {

    // private Long id;
    private String number;
    private BigDecimal limit;

    public CardDTO(Card card) {
        // this.id = card.getId();
        this.number = card.getNumber();
        this.limit = card.getLimit();
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

}
