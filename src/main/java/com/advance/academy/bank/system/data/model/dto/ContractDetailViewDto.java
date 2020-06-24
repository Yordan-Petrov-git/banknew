package com.advance.academy.bank.system.data.model.dto;

import com.advance.academy.bank.system.data.model.enums.ContactType;

import java.math.BigDecimal;

public class ContractDetailViewDto {

    //  private static final ObjectMapper objectMapper = new ObjectMapper();
    private BigDecimal principal;
    private BigDecimal interest;
    private ContactType contactType = ContactType.NONE;
    private String additionalInfo;

    public ContractDetailViewDto() {
    }

    public ContractDetailViewDto(BigDecimal principal, BigDecimal interest, ContactType contactType, String additionalInfo) {
        this.principal = principal;
        this.interest = interest;
        this.contactType = contactType;
        this.additionalInfo = additionalInfo;
    }


    public BigDecimal getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return this.interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public ContactType getContactType() {
        return this.contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


}
