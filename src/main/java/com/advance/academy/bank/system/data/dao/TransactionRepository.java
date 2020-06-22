package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    Transaction findTopById (long id);
}
