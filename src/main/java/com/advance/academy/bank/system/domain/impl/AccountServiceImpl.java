package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.data.dao.AccountRepository;
import com.advance.academy.bank.system.data.model.models.AccountSeedDto;
import com.advance.academy.bank.system.data.model.models.AccountViewDto;
import com.advance.academy.bank.system.domain.AccountService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
    public void createAccount(AccountSeedDto accountSeedDto) {

        Account account = this.modelMapper.map(accountSeedDto, Account.class);
        this.accountRepository.save(account);

    }

    @Override
    public void updateAccount(AccountSeedDto account) {
        //TODO ADD UPDATE
    }

    @Override
    public List<AccountViewDto> getAllAccounts() {


        List<Account> accounts = accountRepository.findAll();

        return modelMapper.map(accounts, new TypeToken<List<AccountViewDto>>() {
        }.getType());


    }

    @Override
    public AccountViewDto getAccountById(long id) {

        return this.modelMapper
                .map(this.accountRepository.findById(id), AccountViewDto.class);

    }

    @Override
    public void deleteAccountById(long id) {
        accountRepository.deleteById(id);
    }


}
