package com.advance.academy.bank.system.data.model.dto;

import com.advance.academy.bank.system.data.model.enums.AccountType;

import javax.validation.constraints.Min;
import java.math.BigDecimal;

public class AccountSeedDto {

    private String iban;
    private UserViewDto owner;
    @Min(0)
    private BigDecimal balance;
    private AccountType accountType = AccountType.NONE;
    private CurrencyViewDto currency;


    public AccountSeedDto() {
    }


    public AccountSeedDto(String iban, UserViewDto owner, @Min(0) BigDecimal balance, AccountType accountType, CurrencyViewDto currency) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
        this.accountType = accountType;
        this.currency = currency;
    }

    public String getIban() {
        return this.iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public UserViewDto getOwner() {
        return this.owner;
    }

    public void setOwner(UserViewDto owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public CurrencyViewDto getCurrency() {
        return this.currency;
    }

    public void setCurrency(CurrencyViewDto currency) {
        this.currency = currency;
    }
}
