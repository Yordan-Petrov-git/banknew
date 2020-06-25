package com.advance.academy.bank.system.data.entities;

import com.advance.academy.bank.system.data.entities.enums.CardType;

import javax.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "cards")
public class Card extends BaseEntity {

    private CardType cardType = CardType.NONE;
    private Instant expirationDate;
    private String cvvCode;
    private String pinCode;
    private Account account;
    private boolean isActive = false;

    public Card() {
    }

    @Column(name = "card_type")
    @Enumerated(EnumType.STRING)
    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Column(name = "epiration_date")
    public Instant getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Instant expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Column(name = "cvv_code")
    public String getCvvCode() {
        return cvvCode;
    }

    public void setCvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
    }

    @Column(name = "ping_code")
    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "account_id")
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Column(name = "is_active")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return isActive == card.isActive &&
                cardType == card.cardType &&
                Objects.equals(expirationDate, card.expirationDate) &&
                Objects.equals(cvvCode, card.cvvCode) &&
                Objects.equals(pinCode, card.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardType, expirationDate, cvvCode, pinCode, isActive);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("cardType=").append(cardType);
        sb.append(", expirationDate=").append(expirationDate);
        sb.append(", cvvCode='").append(cvvCode).append('\'');
        sb.append(", pinCode='").append(pinCode).append('\'');
        sb.append(", isActive=").append(isActive);
        sb.append('}');
        return sb.toString();
    }
}
