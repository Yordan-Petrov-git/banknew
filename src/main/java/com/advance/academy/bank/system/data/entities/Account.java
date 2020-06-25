package com.advance.academy.bank.system.data.entities;

import com.advance.academy.bank.system.data.entities.enums.AccountType;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {


    private String iban;
    private User owner;
    @Min(0)
    private BigDecimal balance;
    private AccountType accountType = AccountType.NONE;
    private Currency currency;

    public Account() {
    }

    @Column(name = "iban",unique = true)
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Column(name = "balance")
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Column(name = "account_type")
    @Enumerated(EnumType.STRING)
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @ManyToOne(targetEntity = Currency.class)
    @JoinColumn(name = "currency_id")
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(iban, account.iban) &&
                Objects.equals(balance, account.balance) &&
                accountType == account.accountType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("iban='").append(iban).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", accountType=").append(accountType);
        sb.append('}');
        return sb.toString();
    }


}
