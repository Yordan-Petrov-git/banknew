package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.Card;
import com.advance.academy.bank.system.domain.impl.CardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cards")
public class CardController {

    private final CardServiceImpl cardService;

    @Autowired
    public CardController(CardServiceImpl cardService) {
        this.cardService = cardService;
    }

    @PostMapping
    public void createCard(@RequestBody Card card) {
        cardService.createCard(card);
    }

    @PutMapping
    public void updateCard(@RequestBody Card card) {

    }

    @GetMapping
    public List<Card> getCard() {
        return cardService.getAllCard();
    }


    @GetMapping("/{id}")
    public Card getCard(@PathVariable("id") Long id) {
        return cardService.getCardById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable("id") Long id) {
          cardService.deleteCardById(id);
    }

}
