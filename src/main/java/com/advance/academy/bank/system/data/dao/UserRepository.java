package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(long id);

    Optional<User> findByFirstName(String firstName);

    Optional<User> findByLastName(String lastName);

    Optional<User>  findByUsername(String username);



}
