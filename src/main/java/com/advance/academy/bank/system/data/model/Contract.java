package com.advance.academy.bank.system.data.model;

import javax.persistence.*;
import java.time.Instant;

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
}
