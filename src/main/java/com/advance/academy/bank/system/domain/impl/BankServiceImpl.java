package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Bank;
import com.advance.academy.bank.system.data.dao.BankRepository;
import com.advance.academy.bank.system.domain.BankService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public BankServiceImpl(BankRepository bankRepository, ModelMapper modelMapper) {
        this.bankRepository = bankRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createBank(Bank bank) {
           bankRepository.saveAndFlush(bank);
    }

    @Override
    public void updateBank(Bank bank) {
   //TODO ADD UPDATE
    }

    @Override
    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    @Override
    public Bank getBankById(long id) {
        return bankRepository.getOne(id);
    }

    @Override
    public void deleteBankById(long id) {
      bankRepository.deleteById(id);
    }
}
