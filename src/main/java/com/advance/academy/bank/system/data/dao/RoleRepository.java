package com.advance.academy.bank.system.data.dao;


import com.advance.academy.bank.system.data.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByAuthority(String authority);

}
