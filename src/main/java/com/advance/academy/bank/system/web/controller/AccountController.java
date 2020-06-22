package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.domain.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    private final AccountServiceImpl accountService;

    @Autowired
    public AccountController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public void createAccount(@RequestBody Account account) {
        accountService.createAccount(account);
    }

    @PutMapping
    public void updateAccount(@RequestBody Account account) {

    }

    @GetMapping
    public List<Account> getAccounts() {
        return accountService.getAllAccounts();
    }


    @GetMapping("/{id}")
    public Account getAccount(@PathVariable("id") Long id) {
        return accountService.getAccountById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable("id") Long id) {
          accountService.deleteAccountById(id);
    }

}

