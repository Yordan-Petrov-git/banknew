package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.models.AccountSeedDto;
import com.advance.academy.bank.system.data.model.models.AccountViewDto;
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
