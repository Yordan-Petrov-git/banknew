package com.advance.academy.bank.system.data.model.dto;

import com.advance.academy.bank.system.data.model.enums.CardType;

import java.time.Instant;

public class CardViewDto {

    private CardType cardType = CardType.NONE;
    private Instant expirationDate;
    private String cvvCode;
    private String pinCode;
    private AccountViewDto account;
    private boolean isActive = false;

    public CardViewDto() {
    }

    public CardViewDto(CardType cardType, Instant expirationDate, String cvvCode, String pinCode, AccountViewDto account, boolean isActive) {
        this.cardType = cardType;
        this.expirationDate = expirationDate;
        this.cvvCode = cvvCode;
        this.pinCode = pinCode;
        this.account = account;
        this.isActive = isActive;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Instant getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Instant expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvvCode() {
        return this.cvvCode;
    }

    public void setCvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
    }

    public String getPinCode() {
        return this.pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public AccountViewDto getAccount() {
        return this.account;
    }

    public void setAccount(AccountViewDto account) {
        this.account = account;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}
