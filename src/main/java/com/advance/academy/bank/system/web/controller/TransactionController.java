package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.Transaction;
import com.advance.academy.bank.system.domain.impl.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/transactions")
public class TransactionController {

    private final TransactionServiceImpl transactionService;

    @Autowired
    public TransactionController(TransactionServiceImpl transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public void createTransaction(@RequestBody Transaction transaction) {
        transactionService.createTransaction(transaction);
    }

    @PutMapping
    public void updateTransaction(@RequestBody Transaction transaction) {

    }

    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{id}")
    public Transaction getTransaction(@PathVariable("id") Long id) {
        return transactionService.getTransactionById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable("id") Long id) {
        transactionService.deleteTransactionById(id);
    }

}
