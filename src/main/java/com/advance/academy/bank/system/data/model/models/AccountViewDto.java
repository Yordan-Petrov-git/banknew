package com.advance.academy.bank.system.data.model.models;

import com.advance.academy.bank.system.data.model.Currency;
import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.data.model.enums.AccountType;

import javax.validation.constraints.Min;
import java.math.BigDecimal;

public class AccountViewDto {


    private String iban;
    private User owner;
    @Min(0)
    private BigDecimal balance;
    private AccountType accountType = AccountType.NONE;
    private Currency currency;


    public AccountViewDto() {
    }


    public AccountViewDto(String iban, User owner, @Min(0) BigDecimal balance, AccountType accountType, Currency currency) {
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

    public User getOwner() {
        return this.owner;
    }

    public void setOwner(User owner) {
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

    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

}
