package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.dto.CurrencySeedDto;
import com.advance.academy.bank.system.data.model.dto.CurrencyViewDto;
;

import java.util.List;

public interface CurrencyService {

    void createCurrency(CurrencySeedDto currencySeedDto);

    void updateCurrency(CurrencySeedDto currencySeedDto);

    CurrencyViewDto getCurrencyById(long id);

    List<CurrencyViewDto> getAllCurrencies();

    void deleteCurrencyById(long id);

}
