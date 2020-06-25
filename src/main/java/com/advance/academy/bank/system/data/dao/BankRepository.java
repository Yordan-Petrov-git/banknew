package com.advance.academy.bank.system.data.dao;


import com.advance.academy.bank.system.data.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    Bank findById(long id);

}
