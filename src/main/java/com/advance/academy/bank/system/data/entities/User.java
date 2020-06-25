package com.advance.academy.bank.system.data.entities;

import com.advance.academy.bank.system.data.entities.enums.UserType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity implements UserDetails {

    private String username;
    private String password;
    private boolean isEnabled = true;
    private boolean isCredentialsNonExpired = true;
    private boolean isAccountNonLocked = true;
    private boolean isAccountNonExpired = true;
    private Set<Role> authorities = new HashSet<>();

    private UserType userType = UserType.NONE;
    private String firstName;
    private String lastName;
    private String egn;
    private String phone;
    private String email;
    private Set<Address> addresses = new HashSet<>();
    private Set<Account> accounts = new HashSet<>();
    private Set<UserSubscription> userSubscriptions = new HashSet<>();

    public User() {
    }

    @Override
    @NonNull
    @NotEmpty
    @Length(min = 2, max = 128)
    @Column(name = "username",unique = true,nullable = false)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    @NotEmpty
    @NonNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password",nullable = false)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.isCredentialsNonExpired = credentialsNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.isAccountNonLocked = accountNonLocked;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.isAccountNonExpired = accountNonExpired;
    }


    @Override
    @ManyToMany(targetEntity = Role.class,
            fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    public Set<Role> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(Set<Role> authorities) {
        this.authorities = authorities;
    }

    @Column(name = "user_type")
    @Enumerated(EnumType.STRING)
    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "egn")
    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "email",nullable = false,unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @ManyToMany(targetEntity = Address.class,
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_address",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "id")
    )
    //   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @OneToMany(targetEntity = Account.class
            , cascade = CascadeType.ALL)
    // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    @OneToMany(targetEntity = UserSubscription.class)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Set<UserSubscription> getUserSubscriptions() {
        return userSubscriptions;
    }

    public void setUserSubscriptions(Set<UserSubscription> userSubscriptions) {
        this.userSubscriptions = userSubscriptions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return isEnabled == user.isEnabled &&
                isCredentialsNonExpired == user.isCredentialsNonExpired &&
                isAccountNonLocked == user.isAccountNonLocked &&
                isAccountNonExpired == user.isAccountNonExpired &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                userType == user.userType &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(egn, user.egn) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(email, user.email) ;

    }




    @Override
    public int hashCode() {
        return Objects.hash(username, password, isEnabled,
                isCredentialsNonExpired, isAccountNonLocked,
                isAccountNonExpired, authorities, userType, firstName,
                lastName, egn, phone, email);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", isCredentialsNonExpired=").append(isCredentialsNonExpired);
        sb.append(", isAccountNonLocked=").append(isAccountNonLocked);
        sb.append(", isAccountNonExpired=").append(isAccountNonExpired);
        sb.append(", authorities=").append(authorities);
        sb.append(", userType=").append(userType);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", egn='").append(egn).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return this.isAccountNonExpired;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return this.isAccountNonLocked;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return this.isCredentialsNonExpired;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return this.isEnabled;
    }

}
