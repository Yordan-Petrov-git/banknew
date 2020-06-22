package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.Bank;
import com.advance.academy.bank.system.domain.impl.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/banks")
public class BankController {

    private final BankServiceImpl bankService;

    @Autowired
    public BankController(BankServiceImpl bankService) {
        this.bankService = bankService;
    }


    @PostMapping
    public void createBank(@RequestBody Bank bank) {
        bankService.createBank(bank);
    }

    @PutMapping
    public void updateBank(@RequestBody Bank bank) {

    }

    @GetMapping
    public List<Bank> getBnaks() {
        return bankService.getAllBanks();
    }

    @GetMapping("/{id}")
    public Bank getBank(@PathVariable("id") Long id) {
        return bankService.getBankById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBank(@PathVariable("id") Long id) {
        bankService.deleteBankById(id);
    }


}
