package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.data.model.dto.AccountSeedDto;
import com.advance.academy.bank.system.data.model.dto.AccountViewDto;
import com.advance.academy.bank.system.domain.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public void createAccount(@RequestBody AccountSeedDto account) {
        accountService.createAccount(account);
    }

    @PutMapping
    public void updateAccount(@RequestBody AccountSeedDto account) {
        accountService.updateAccount(account);
    }

    @GetMapping
    public List<AccountViewDto> getAccounts() {
        return accountService.getAllAccounts();
    }


    @GetMapping("/{id}")
    public AccountViewDto getAccount(@PathVariable("id") Long id) {
        return accountService.getAccountById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable("id") Long id) {
        accountService.deleteAccountById(id);
    }

}

