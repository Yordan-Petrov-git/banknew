package com.advance.academy.bank.system.domain.services;

import com.advance.academy.bank.system.data.models.CurrencySeedDto;
import com.advance.academy.bank.system.data.models.CurrencyViewDto;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface CurrencyService {

    void createCurrency(CurrencySeedDto currencySeedDto);

    void updateCurrency(CurrencySeedDto currencySeedDto);

    CurrencyViewDto getCurrencyById(long id);

    List<CurrencyViewDto> getAllCurrencies();

    void deleteCurrencyById(long id);

}
