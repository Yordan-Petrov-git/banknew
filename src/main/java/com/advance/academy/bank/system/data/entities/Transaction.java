package com.advance.academy.bank.system.data.entities;


import com.advance.academy.bank.system.data.entities.enums.TransactionStatus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {


    private Bank bank;
    private Account recipient;
    private Account sender;
    private String description;
    private Instant dateCreated;
    private Instant dateCompleted;
    private Instant dateUpdated;
    private TransactionStatus transactionStatus = TransactionStatus.NEW;
    private Long fee;
    private BigDecimal amount;

    public Transaction() {
    }

    @ManyToOne(targetEntity = Bank.class)
    @JoinColumn(name = "bank_id")
    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "recipient_id")
    public Account getRecipient() {
        return recipient;
    }

    public void setRecipient(Account recipient) {
        this.recipient = recipient;
    }

    @ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "sender_id")
    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "date_created")
    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Column(name = "date_completed")
    public Instant getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Instant dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    @Column(name = "date_updated")
    public Instant getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Column(name = "transaction_status")
    @Enumerated(EnumType.STRING)
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @Column(name = "fee")
    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    @Column(name = "amaunt")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return
                Objects.equals(description, that.description) &&
                Objects.equals(dateCreated, that.dateCreated) &&
                Objects.equals(dateCompleted, that.dateCompleted) &&
                Objects.equals(dateUpdated, that.dateUpdated) &&
                transactionStatus == that.transactionStatus &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dateCreated, dateCompleted, dateUpdated, transactionStatus, fee, amount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("id=").append(id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", dateCreated=").append(dateCreated);
        sb.append(", dateCompleted=").append(dateCompleted);
        sb.append(", dateUpdated=").append(dateUpdated);
        sb.append(", transactionStatus=").append(transactionStatus);
        sb.append(", fee=").append(fee);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }

}
