package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Bank;
import com.advance.academy.bank.system.data.dao.BankRepository;
import com.advance.academy.bank.system.data.model.dto.BankSeedDto;
import com.advance.academy.bank.system.data.model.dto.BankViewDto;
import com.advance.academy.bank.system.domain.BankService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
    public void createBank(BankSeedDto bankSeedDto) {

        Bank bank = this.modelMapper.map(bankSeedDto, Bank.class);
        this.bankRepository.save(bank);
    }

    @Override
    public void updateBank(BankSeedDto bank) {
        //TODO ADD UPDATE
    }

    @Override
    public List<BankViewDto> getAllBanks() {

        List<Bank> banks = bankRepository.findAll();

        return modelMapper.map(banks, new TypeToken<List<BankViewDto>>() {
        }.getType());

    }

    @Override
    public BankViewDto getBankById(long id) {


        return this.modelMapper
                .map(this.bankRepository.findById(id), BankViewDto.class);


    }


    @Override
    public void deleteBankById(long id) {
        bankRepository.deleteById(id);
    }
}
