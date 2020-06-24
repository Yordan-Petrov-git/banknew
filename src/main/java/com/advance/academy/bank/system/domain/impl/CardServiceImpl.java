package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Card;
import com.advance.academy.bank.system.data.dao.CardRepository;
import com.advance.academy.bank.system.data.model.dto.CardSeedDto;
import com.advance.academy.bank.system.data.model.dto.CardViewDto;
import com.advance.academy.bank.system.domain.CardService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CardServiceImpl(CardRepository cardRepository, ModelMapper modelMapper) {
        this.cardRepository = cardRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public void createCard(CardSeedDto cardSeedDto) {


        Card card = this.modelMapper.map(cardSeedDto, Card.class);
        this.cardRepository.save(card);


    }

    @Override
    public void updateCard(CardSeedDto card) {
        //TODO ADD UPDATE
    }

    @Override
    public List<CardViewDto> getAllCard() {

        List<Card> cards = cardRepository.findAll();

        return modelMapper.map(cards, new TypeToken<List<CardViewDto>>() {
        }.getType());


    }

    @Override
    public CardViewDto getCardById(long id) {


        return this.modelMapper
                .map(this.cardRepository.findById(id), CardViewDto.class);

    }

    @Override
    public void deleteCardById(long id) {
        cardRepository.existsById(id);
    }
}
