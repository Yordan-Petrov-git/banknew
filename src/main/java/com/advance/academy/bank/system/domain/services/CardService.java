package com.advance.academy.bank.system.domain.services;

import com.advance.academy.bank.system.data.models.CardSeedDto;
import com.advance.academy.bank.system.data.models.CardViewDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CardService {

    void createCard(CardSeedDto cardSeedDto);

    void updateCard(CardSeedDto cardSeedDto);

    List<CardViewDto> getAllCard();

    CardViewDto getCardById(long id);

    void deleteCardById(long id);

}
