package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.models.CurrencySeedDto;
import com.advance.academy.bank.system.data.models.CurrencyViewDto;
import com.advance.academy.bank.system.domain.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/currencies")
public class CurrencyController {

    private final CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @PostMapping
    public void createCurrency(@RequestBody CurrencySeedDto currency) {

    }

    @PutMapping
    public void updateCurrency(@RequestBody CurrencySeedDto currency) {

    }

    @GetMapping
    public List<CurrencyViewDto> getCurrency() {
        return currencyService.getAllCurrencies();
    }


    @GetMapping("/{id}")
    public CurrencyViewDto getCurrency(@PathVariable("id") Long id) {

        return currencyService.getCurrencyById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCurrency(@PathVariable("id") Long id) {

         currencyService.deleteCurrencyById(id);
    }
}
