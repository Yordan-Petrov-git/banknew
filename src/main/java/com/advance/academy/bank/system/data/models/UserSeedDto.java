package com.advance.academy.bank.system.data.models;

import com.advance.academy.bank.system.data.entities.enums.UserType;

import java.util.HashSet;
import java.util.Set;

public class UserSeedDto {

    private Long id;
    private String username;
    private String password;
    private String confirmPassword;
    private UserType userType;
    private String firstName;
    private String lastName;
    private String egn;
    private String phone;
    private String email;
    private Set<AddressSeedDto> addresses = new HashSet<>();
    private Set<AccountSeedDto> accounts = new HashSet<>();
    private Set<UserSubscriptionSeedDto> userSubscriptions = new HashSet<>();
    private Set<RoleServiceModel> authorities = new HashSet<>();

    public UserSeedDto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public String getConfirmPassword() {
        return this.confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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

    public Set<AddressSeedDto> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(Set<AddressSeedDto> addresses) {
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

    public Set<RoleServiceModel> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(Set<RoleServiceModel> authorities) {
        this.authorities = authorities;
    }
}
