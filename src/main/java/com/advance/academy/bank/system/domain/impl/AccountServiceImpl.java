package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.data.dao.AccountRepository;
import com.advance.academy.bank.system.domain.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {


    private final AccountRepository accountRepository;
    private final ModelMapper modelMapper;
    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository, ModelMapper modelMapper) {
        this.accountRepository = accountRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void updateAccount(Account account) {
     //TODO ADD UPDATE
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(long id) {
        return accountRepository.findById(id);
    }

    @Override
    public void deleteAccountById(long id) {
        accountRepository.deleteById(id);
    }


}
