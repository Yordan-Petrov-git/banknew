package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.Currency;
import com.advance.academy.bank.system.domain.CurrencyService;
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
    public void createCurrency(@RequestBody Currency currency) {

    }

    @PutMapping
    public void updateCurrency(@RequestBody Currency currency) {

    }

    @GetMapping
    public List<Currency> getCurrency() {
        return null;
    }


    @GetMapping("/{id}")
    public Currency getCurrency(@PathVariable("id") Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCurrency(@PathVariable("id") Long id) {

    }
}
