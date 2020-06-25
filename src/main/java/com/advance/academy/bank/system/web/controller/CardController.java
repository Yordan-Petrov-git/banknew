package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.models.CardSeedDto;
import com.advance.academy.bank.system.data.model.models.CardViewDto;
import com.advance.academy.bank.system.domain.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cards")
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping
    public void createCard(@RequestBody CardSeedDto card) {
        cardService.createCard(card);
    }

    @PutMapping
    public void updateCard(@RequestBody CardSeedDto card) {
        cardService.updateCard(card);
    }

    @GetMapping
    public List<CardViewDto> getCard() {
        return cardService.getAllCard();
    }


    @GetMapping("/{id}")
    public CardViewDto getCard(@PathVariable("id") Long id) {
        return cardService.getCardById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable("id") Long id) {
        cardService.deleteCardById(id);
    }

}
