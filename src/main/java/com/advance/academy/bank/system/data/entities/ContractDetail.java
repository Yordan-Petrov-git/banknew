package com.advance.academy.bank.system.data.entities;

import com.advance.academy.bank.system.data.entities.enums.ContactType;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "contact_details")
public class ContractDetail extends BaseEntity {

   // private static final ObjectMapper objectMapper = new ObjectMapper();
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractDetail)) return false;
        ContractDetail that = (ContractDetail) o;
        return Objects.equals(principal, that.principal) &&
                Objects.equals(interest, that.interest) &&
                contactType == that.contactType &&
                Objects.equals(additionalInfo, that.additionalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principal, interest, contactType, additionalInfo);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractDetail{");
        sb.append("principal=").append(principal);
        sb.append(", interest=").append(interest);
        sb.append(", contactType=").append(contactType);
        sb.append(", additionalInfo='").append(additionalInfo).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
