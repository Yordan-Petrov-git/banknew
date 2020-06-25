package com.advance.academy.bank.system.data.models;

import com.advance.academy.bank.system.data.entities.enums.UserType;

import java.util.HashSet;
import java.util.Set;

public class UserViewDto {

    private String username;
    private String password;
    private UserType userType;
    private String firstName;
    private String lastName;
    private String egn;
    private String phone;
    private String email;
    private Set<AddressViewDto> addresses = new HashSet<>();
    private Set<AccountSeedDto> accounts = new HashSet<>();
    private Set<UserSubscriptionSeedDto> userSubscriptions = new HashSet<>();


    public UserViewDto(String username, String password, UserType userType, String firstName, String lastName, String egn, String phone, String email, Set<AddressViewDto> addresses, Set<AccountSeedDto> accounts, Set<UserSubscriptionSeedDto> userSubscriptions) {
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.egn = egn;
        this.phone = phone;
        this.email = email;
        this.addresses = addresses;
        this.accounts = accounts;
        this.userSubscriptions = userSubscriptions;
    }

    public UserViewDto() {
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Set<AccountSeedDto> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(Set<AccountSeedDto> accounts) {
        this.accounts = accounts;
    }

    public Set<UserSubscriptionSeedDto> getUserSubscriptions() {
        return this.userSubscriptions;
    }

    public void setUserSubscriptions(Set<UserSubscriptionSeedDto> userSubscriptions) {
        this.userSubscriptions = userSubscriptions;
    }
}
