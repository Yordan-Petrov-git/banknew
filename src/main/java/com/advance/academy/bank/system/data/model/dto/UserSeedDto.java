package com.advance.academy.bank.system.data.model.dto;

import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.data.model.Address;
import com.advance.academy.bank.system.data.model.UserSubscription;
import com.advance.academy.bank.system.data.model.enums.UserType;

import java.util.HashSet;
import java.util.Set;

public class UserSeedDto {

    private UserType userType;
    private String firstName;
    private String lastName;
    private String egn;
    private String phone;
    private String email;
    private Set<Address> addresses = new HashSet<>();
    private Set<Account> accounts = new HashSet<>();
    private Set<UserSubscription> userSubscriptions = new HashSet<>();


    public UserSeedDto() {
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

    public Set<Address> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Account> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<UserSubscription> getUserSubscriptions() {
        return this.userSubscriptions;
    }

    public void setUserSubscriptions(Set<UserSubscription> userSubscriptions) {
        this.userSubscriptions = userSubscriptions;
    }
}
