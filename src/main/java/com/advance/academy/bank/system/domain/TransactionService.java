package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface TransactionService {

    void createTransaction(Transaction transaction);

    void updateTransaction(Transaction transaction);

    Transaction getTransactionById(long id);

    List<Transaction> getAllTransactions();

    void deleteTransactionById(long id);

    void withdrawMoney(long id, BigDecimal amount);

    void depositMoney(long id, BigDecimal amount);

    void transferMoney(long toId, long fromId, BigDecimal amount);

}
