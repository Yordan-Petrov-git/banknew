package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.Card;
import com.advance.academy.bank.system.data.model.dto.CardSeedDto;
import com.advance.academy.bank.system.data.model.dto.CardViewDto;
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
