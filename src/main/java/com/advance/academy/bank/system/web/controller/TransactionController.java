package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.models.TransactionSeedDto;
import com.advance.academy.bank.system.data.models.TransactionViewDto;
import com.advance.academy.bank.system.domain.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public void createTransaction(@RequestBody TransactionSeedDto transaction) {
        transactionService.createTransaction(transaction);
    }

    @PutMapping
    public void updateTransaction(@RequestBody TransactionSeedDto transaction) {
        transactionService.updateTransaction(transaction);
    }

    @GetMapping
    public List<TransactionViewDto> getTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{id}")
    public TransactionViewDto getTransaction(@PathVariable("id") Long id) {
        return transactionService.getTransactionById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable("id") Long id) {
        transactionService.deleteTransactionById(id);
    }

}
