package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Card;
import com.advance.academy.bank.system.data.dao.CardRepository;
import com.advance.academy.bank.system.domain.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }


    @Override
    public void createCard(Card card) {
        cardRepository.save(card);
    }

    @Override
    public void updateCard(Card card) {
        //TODO ADD UPDATE
    }

    @Override
    public List<Card> getAllCard() {
        return cardRepository.findAll();
    }

    @Override
    public Card getCardById(long id) {
        return cardRepository.getOne(id);
    }

    @Override
    public void deleteCardById(long id) {
        cardRepository.existsById(id);
    }
}