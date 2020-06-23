package com.advance.academy.bank.system.data.model.dto;

import com.advance.academy.bank.system.data.model.Address;
import com.advance.academy.bank.system.data.model.enums.UserType;

import java.util.HashSet;
import java.util.Set;

public class UserViewDto {

    private UserType userType;
    private String firstName;
    private String lastName;
    private String egn;
    private String phone;
    private String email;
    private Set<AddressViewDto> addresses = new HashSet<>();

    public UserViewDto(UserType userType, String firstName, String lastName, String egn, String phone, String email, Set<AddressViewDto> addresses) {
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.egn = egn;
        this.phone = phone;
        this.email = email;
        this.addresses = addresses;
    }

    public UserViewDto() {
    }

    public UserType getUserType() {
        return this.userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEgn() {
        return this.egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<AddressViewDto> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(Set<AddressViewDto> addresses) {
        this.addresses = addresses;
    }
}
