package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.data.model.dto.CityViewDto;
import com.advance.academy.bank.system.data.model.dto.TransactionSeedDto;
import com.advance.academy.bank.system.data.model.dto.TransactionViewDto;
import com.advance.academy.bank.system.data.model.dto.UserViewDto;
import com.advance.academy.bank.system.exeption.IllegalBankOperationException;
import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.data.model.Transaction;
import com.advance.academy.bank.system.data.dao.AccountRepository;
import com.advance.academy.bank.system.data.dao.TransactionRepository;
import com.advance.academy.bank.system.domain.TransactionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
    public void createTransaction(TransactionSeedDto transactionSeedDto) {
        Transaction transaction = this.modelMapper.map(transactionSeedDto, Transaction.class);
        this.transactionRepository.save(transaction);

    }

    @Override
    public void updateTransaction(TransactionSeedDto transactionSeedDto) {
        //TODO ADD TRANSACTION
    }

    @Override
    public TransactionViewDto getTransactionById(long id) {

        return this.modelMapper
                .map(this.transactionRepository.findById(id), TransactionViewDto.class);

    }

    @Override
    public List<TransactionViewDto> getAllTransactions() {
        List<Transaction> transactions = transactionRepository.findAll();

        return modelMapper.map(transactions, new TypeToken<List<TransactionViewDto>>() {
        }.getType());
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

        //TODO ADD UPDATE OPERATION

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

        //TODO ADD UPDATE OPERATION
        account.setBalance(account.getBalance().add(amount));
        accountRepository.save(account);
    }

    @Transactional
    @Override
    public void transferMoney(long toId, long fromId, BigDecimal amount) {

        //TODO ADD UPDATE OPERATION
        depositMoney(toId, amount);
        withdrawMoney(fromId, amount);

        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalBankOperationException(String.
                    format("Deposit amount cannot be : %.2f",
                            amount));
        }


    }
}
