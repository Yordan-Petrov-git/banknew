package com.advance.academy.bank.system.domain.services;

import com.advance.academy.bank.system.data.models.BankSeedDto;
import com.advance.academy.bank.system.data.models.BankViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankService {

    void createBank(BankSeedDto bankSeedDto);

    void updateBank(BankSeedDto bankSeedDto);

    List<BankViewDto> getAllBanks();

    BankViewDto getBankById(long id);

    void deleteBankById(long id);

}
