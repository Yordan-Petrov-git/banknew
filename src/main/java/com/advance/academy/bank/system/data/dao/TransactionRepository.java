package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    Transaction findById (long id);
}
