package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.data.model.dto.AccountSeedDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    void createAccount(AccountSeedDto account);

    void updateAccount(Account account);

    List<Account> getAllAccounts();

    Account getAccountById(long id);

    void deleteAccountById(long id);


}
