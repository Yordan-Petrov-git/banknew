package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.models.TransactionSeedDto;
import com.advance.academy.bank.system.data.model.models.TransactionViewDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
public interface TransactionService {

    void createTransaction(TransactionSeedDto transactionSeedDto);

    void updateTransaction(TransactionSeedDto transactionSeedDto);

    TransactionViewDto getTransactionById(long id);

    List<TransactionViewDto> getAllTransactions();

    void deleteTransactionById(long id);

    void withdrawMoney(long id, BigDecimal amount);

    void depositMoney(long id, BigDecimal amount);

    void transferMoney(long toId, long fromId, BigDecimal amount);

}
