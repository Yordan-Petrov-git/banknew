package com.advance.academy.bank.system.data.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "roles")
public class Role extends BaseEntity   {

    private String authority;
    private Set<User> users = new HashSet<>();


    public Role(String authority) {
        this.authority = authority;
    }


    public Role(Set<User> users) {
        this.users = users;
    }

    public Role() {
    }


    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @ManyToMany(targetEntity = User.class,
            mappedBy = "authorities",
            fetch = FetchType.EAGER)
    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return Objects.equals(authority, role.authority) &&
                Objects.equals(users, role.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authority, users);
    }
}
