package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.Card;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CardService {

    void createCard(Card card);

    void updateCard(Card card);

    List<Card> getAllCard();

    Card getCardById(long id);

    void deleteCardById(long id);

}
