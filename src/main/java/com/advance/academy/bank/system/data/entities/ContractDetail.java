package com.advance.academy.bank.system.data.entities;

import com.advance.academy.bank.system.data.entities.enums.ContactType;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "contact_details")
public class ContractDetail extends BaseEntity {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private BigDecimal principal;
    private BigDecimal interest;
    private ContactType contactType = ContactType.NONE;
    private String additionalInfo;

    public ContractDetail() {
    }

    @Column(name = "principal")
    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    @Column(name = "interest")
    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    @Column(name = "contact_type")
    @Enumerated(EnumType.STRING)
    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

//
//    @Column(name = "additional_info",
//            columnDefinition = "jsonb")
//    public Map<String, Object> getAdditionalInfo()
//            throws JsonProcessingException {
//
//        return objectMapper.readValue(additionalInfo, Map.class);
//
//    }
//
//    public void setAdditionalInfo(Map<String, Object> additionalInfo)
//            throws JsonProcessingException {
//
//        this.additionalInfo =
//                objectMapper.writeValueAsString(additionalInfo);
//    }
}
