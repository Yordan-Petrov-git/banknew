package com.advance.academy.bank.system.data.entities;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "contacts")
public class Contract extends BaseEntity {

    private Account account;
    private Instant expiresOn;
    private Instant createdOn;
    private ContractDetail contractDetails;

    public Contract() {
    }




    @ManyToOne
    @JoinColumn(name = "account_id")
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Column(name = "expires_on")
    public Instant getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(Instant expiresOn) {
        this.expiresOn = expiresOn;
    }

    @Column(name = "created_on")
    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    @ManyToOne()
    @JoinColumn(name = "contact_details_id")
    public ContractDetail getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(ContractDetail contractDetails) {
        this.contractDetails = contractDetails;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contract)) return false;
        Contract contract = (Contract) o;
        return
                Objects.equals(expiresOn, contract.expiresOn) &&
                Objects.equals(createdOn, contract.createdOn) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiresOn, createdOn);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contract{");
        sb.append(", expiresOn=").append(expiresOn);
        sb.append(", createdOn=").append(createdOn);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
