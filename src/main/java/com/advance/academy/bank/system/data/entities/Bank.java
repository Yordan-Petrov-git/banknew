package com.advance.academy.bank.system.data.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "banks")
public class Bank extends BaseEntity {


    private String name;
    private Address address;
    private String swiftNumber;
    //private Map<String, Object> additionalInfo = new HashMap<>();

    public Bank() {
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(targetEntity = Address.class,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Column(name = "swift_number")
    public String getSwiftNumber() {
        return swiftNumber;
    }

    public void setSwiftNumber(String swiftNumber) {
        this.swiftNumber = swiftNumber;
    }

//    @Column(name = "additional_info")
//    @ManyToOne()
//    @JoinColumn(name = "")
//    public Map<String, Object> getAdditionalInfo() {
//        return additionalInfo;
//    }
//
//    public void setAdditionalInfo(Map<String, Object> additionalInfo) {
//        this.additionalInfo = additionalInfo;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;
        if (!super.equals(o)) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) &&
                Objects.equals(swiftNumber, bank.swiftNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, swiftNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bank{");
        sb.append("name='").append(name).append('\'');
        sb.append(", swiftNumber='").append(swiftNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
