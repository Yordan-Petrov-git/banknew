package com.advance.academy.bank.system.init;

import com.advance.academy.bank.system.data.model.*;
import com.advance.academy.bank.system.data.model.enums.UserType;
import com.advance.academy.bank.system.exeption.IllegalBankOperationException;
import com.advance.academy.bank.system.data.model.enums.AccountType;
import com.advance.academy.bank.system.domain.AccountService;
import com.advance.academy.bank.system.domain.TransactionService;
import com.advance.academy.bank.system.domain.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;


@Component
@Slf4j
public class AppRunner implements CommandLineRunner {


    private final UserService userService;
    private final TransactionService transactionService;
    private final AccountService accountService;

    @Autowired
    public AppRunner(UserService userService, TransactionService transactionService, AccountService accountService) {
        this.userService = userService;
        this.transactionService = transactionService;
        this.accountService = accountService;
    }


    @Override

    public void run(String... args) throws Exception {
//
//        Set<Account> acc = new HashSet<Account>();
//        Set<Account> acc1 = new HashSet<Account>();
//
//
//        User user = new User();
//
//        user.setFirstName("Ivan");
//        user.setLastName("Ivanonv");
//        user.setPhone("1234");
//        user.setEgn("9999999999");
//        user.setEmail("testEmail@gmail.com");
//        user.setUserType(UserType.NONE);
//        //user.setUserSubscriptions();
//
//        Account account = new Account();
//        account.setIban("96262ad52a25a");
//        account.setOwner(user);
//        account.setAccountType(AccountType.CHECKING);
//        account.setBalance(new BigDecimal(5000));
//        //account.setCurrency();
//
////        //add accounts
////        acc.add(account);
////        user.setAccounts(acc);
//
//        User user1 = new User();
//        user1.setFirstName("asd");
//        user1.setLastName("dsa");
//        user1.setPhone("1234999");
//        Account account1 = new Account();
//        account1.setOwner(user1);
//        account1.setIban("asdasdsa3wer");
//        account1.setBalance(new BigDecimal(1000));
//
////        acc1.add(account1);
////        user1.setAccounts(acc1);
//
//
//        Transaction transaction = new Transaction();
//        transaction.setSender(account);
//        transaction.setRecipient(account1);
//        transaction.setAmount(new BigDecimal(500));
//        transaction.setDateCreated(Instant.now());
//
//        userService.createUser(user);
//
//        userService.createUser(user1);
//
//        accountService.createAccount(account);
//
//        accountService.createAccount(account1);
//
//        transactionService.createTransaction(transaction);
//
////----------------------------------------------------------------------------
//        log.info("user   {}",
//                accountService.getAccountById(user.getId()));
//
//        log.info("user 1   {}",
//                accountService.getAccountById(user1.getId()));
//
//
//        transactionService.depositMoney(account.getId(), new BigDecimal(200));
////----------------------------------------------------------------------------
//
//        log.info("user  balance after deposit {} ",
//                accountService.getAccountById(user.getId())
//        );
////----------------------------------------------------------------------------
//
//        try {
//
//            transactionService.withdrawMoney(account.getId(), new BigDecimal(50));
//
//            log.info("user balance after withdraw {}",
//                    accountService.getAccountById(user.getId()));
//
//
//            transactionService.transferMoney(transaction.getRecipient().getId()
//                    , transaction.getSender().getId(),
//                    transaction.getAmount());
//
//            log.info("transfer amount {}",
//                    transactionService.getTransactionById(transaction.getId()));
//
//            log.info("user balance after transaction {}",
//                    accountService.getAccountById(user.getId()));
//
//            log.info("user 1 balance after transaction {}",
//                    accountService.getAccountById(user1.getId()));
//
//        } catch (IllegalBankOperationException e) {
//            log.error(e.getMessage());
//        }


    }
}
