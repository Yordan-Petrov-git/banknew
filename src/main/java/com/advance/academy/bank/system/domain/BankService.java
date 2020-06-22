package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.Bank;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankService {

    void createBank(Bank bank);

    void updateBank(Bank bank);

    List<Bank> getAllBanks();

    Bank getBankById(long id);

    void deleteBankById(long id);

}
