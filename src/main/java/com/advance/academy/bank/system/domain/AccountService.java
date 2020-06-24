package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.dto.AccountSeedDto;
import com.advance.academy.bank.system.data.model.dto.AccountViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    void createAccount(AccountSeedDto account);

    void updateAccount(AccountSeedDto account);

    List<AccountViewDto> getAllAccounts();

    AccountViewDto getAccountById(long id);

    void deleteAccountById(long id);


}
