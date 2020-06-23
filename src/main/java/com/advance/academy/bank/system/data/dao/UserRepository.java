package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    User findByFirstName(String firstName);

    User findByLastName(String lastName);


}
