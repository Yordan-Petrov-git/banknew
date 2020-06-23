package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.exeption.IllegalBankOperationException;
import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.data.model.Transaction;
import com.advance.academy.bank.system.data.dao.AccountRepository;
import com.advance.academy.bank.system.data.dao.TransactionRepository;
import com.advance.academy.bank.system.domain.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {


    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository, AccountRepository accountRepository, ModelMapper modelMapper) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public void createTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        //TODO ADD TRANSACTION
    }

    @Override
    public Transaction getTransactionById(long id) {
        return transactionRepository.findTopById(id);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public void deleteTransactionById(long id) {
        transactionRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void withdrawMoney(long id, BigDecimal amount) {
        Account account = accountRepository.findById(id);
        if (account.getBalance().compareTo(amount) < 0) {
            throw new IllegalBankOperationException(String.
                    format("Current balance : %.2f is not sufficient to withdraw amount:  %.2f",
                            account.getBalance(), amount));
        }
        account.setBalance(account.getBalance().subtract(amount));
        accountRepository.save(account);
    }

    @Transactional
    @Override
    public void depositMoney(long id, BigDecimal amount) {
        Account account = accountRepository.findById(id);
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalBankOperationException(String.
                    format("Deposit amount cannot be : %.2f",
                            amount));
        }
        account.setBalance(account.getBalance().add(amount));
        accountRepository.save(account);
    }

    @Transactional
    @Override
    public void transferMoney(long toId, long fromId, BigDecimal amount) {


        depositMoney(toId, amount);
        withdrawMoney(fromId, amount);

        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalBankOperationException(String.
                    format("Deposit amount cannot be : %.2f",
                            amount));
        }


    }
}
