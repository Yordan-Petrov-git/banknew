package com.advance.academy.bank.system.data.models;

import com.advance.academy.bank.system.data.entities.enums.TransactionStatus;

import java.math.BigDecimal;
import java.time.Instant;

public class TransactionViewDto {


    private BankViewDto bank;
    private AccountViewDto recipient;
    private AccountViewDto sender;
    private String description;
    private Instant dateCreated;
    private Instant dateCompleted;
    private Instant dateUpdated;
    private TransactionStatus transactionStatus = TransactionStatus.NEW;
    private Long fee;
    private BigDecimal amount;


    public TransactionViewDto() {
    }

    public TransactionViewDto(BankViewDto bank, AccountViewDto recipient, AccountViewDto sender, String description, Instant dateCreated, Instant dateCompleted, Instant dateUpdated, TransactionStatus transactionStatus, Long fee, BigDecimal amount) {
        this.bank = bank;
        this.recipient = recipient;
        this.sender = sender;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateCompleted = dateCompleted;
        this.dateUpdated = dateUpdated;
        this.transactionStatus = transactionStatus;
        this.fee = fee;
        this.amount = amount;
    }


    public BankViewDto getBank() {
        return this.bank;
    }

    public void setBank(BankViewDto bank) {
        this.bank = bank;
    }

    public AccountViewDto getRecipient() {
        return this.recipient;
    }

    public void setRecipient(AccountViewDto recipient) {
        this.recipient = recipient;
    }

    public AccountViewDto getSender() {
        return this.sender;
    }

    public void setSender(AccountViewDto sender) {
        this.sender = sender;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Instant getDateCompleted() {
        return this.dateCompleted;
    }

    public void setDateCompleted(Instant dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Instant getDateUpdated() {
        return this.dateUpdated;
    }

    public void setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public TransactionStatus getTransactionStatus() {
        return this.transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Long getFee() {
        return this.fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
