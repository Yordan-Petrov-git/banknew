package com.advance.academy.bank.system.data.model.models;


import java.time.Instant;

public class ContractSeedDto {

    private AccountViewDto account;
    private Instant expiresOn;
    private Instant createdOn;
    private ContractDetailViewDto contractDetails;

    public ContractSeedDto() {
    }

    public ContractSeedDto(AccountViewDto account, Instant expiresOn, Instant createdOn, ContractDetailViewDto contractDetails) {
        this.account = account;
        this.expiresOn = expiresOn;
        this.createdOn = createdOn;
        this.contractDetails = contractDetails;
    }

    public AccountViewDto getAccount() {
        return this.account;
    }

    public void setAccount(AccountViewDto account) {
        this.account = account;
    }

    public Instant getExpiresOn() {
        return this.expiresOn;
    }

    public void setExpiresOn(Instant expiresOn) {
        this.expiresOn = expiresOn;
    }

    public Instant getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public ContractDetailViewDto getContractDetails() {
        return this.contractDetails;
    }

    public void setContractDetails(ContractDetailViewDto contractDetails) {
        this.contractDetails = contractDetails;
    }
}
