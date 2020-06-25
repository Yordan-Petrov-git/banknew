package com.advance.academy.bank.system.domain.services.impl;

import com.advance.academy.bank.system.data.dao.CurrencyRepository;
import com.advance.academy.bank.system.data.entities.Currency;
import com.advance.academy.bank.system.data.models.CurrencySeedDto;
import com.advance.academy.bank.system.data.models.CurrencyViewDto;
import com.advance.academy.bank.system.domain.services.CurrencyService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    private final ModelMapper modelMapper;
    private final CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyServiceImpl(ModelMapper modelMapper, CurrencyRepository currencyRepository) {
        this.modelMapper = modelMapper;
        this.currencyRepository = currencyRepository;
    }

    @Override
    public void createCurrency(CurrencySeedDto currencySeedDto) {
        Currency currency = this.modelMapper.map(currencySeedDto, Currency.class);
        this.currencyRepository.save(currency);
    }

    @Override
    public void updateCurrency(CurrencySeedDto currencySeedDto) {

    }

    @Override
    public CurrencyViewDto getCurrencyById(long id) {
        return this.modelMapper
                .map(this.currencyRepository.findById(id), CurrencyViewDto.class);
    }

    @Override
    public List<CurrencyViewDto> getAllCurrencies() {

        List<Currency> currencies = currencyRepository.findAll();

        return modelMapper.map(currencies, new TypeToken<List<CurrencyViewDto>>() {
        }.getType());
    }

    @Override
    public void deleteCurrencyById(long id) {

    }
}
