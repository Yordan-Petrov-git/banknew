package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.models.BankSeedDto;
import com.advance.academy.bank.system.data.model.models.BankViewDto;
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
