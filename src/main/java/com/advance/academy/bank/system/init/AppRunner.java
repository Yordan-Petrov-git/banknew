package com.advance.academy.bank.system.init;

import com.advance.academy.bank.system.data.model.dto.AddressSeedDto;
import com.advance.academy.bank.system.data.model.dto.AddressSeedDtoWithCity;
import com.advance.academy.bank.system.data.model.dto.CitySeedDto;
import com.advance.academy.bank.system.data.model.dto.CityViewDto;
import com.advance.academy.bank.system.domain.*;
import com.advance.academy.bank.system.domain.impl.CityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class AppRunner implements CommandLineRunner {


    private final UserService userService;
    private final TransactionService transactionService;
    private final AccountService accountService;
    private final AddressService addressService;
    private final CityService cityService;

    @Autowired
    public AppRunner(UserService userService, TransactionService transactionService, AccountService accountService, AddressService addressService, CityService cityService, CityServiceImpl cityService1) {
        this.userService = userService;
        this.transactionService = transactionService;
        this.accountService = accountService;
        this.addressService = addressService;
        this.cityService = cityService1;
    }


    @Override

    public void run(String... args) throws Exception {



        CitySeedDto citySeedDto = new CitySeedDto();
        citySeedDto.setCityName("Varna");
        citySeedDto.setPostalCode("9000");

        cityService.createCity(citySeedDto);
//
        CitySeedDto citySeedDto1 = new CitySeedDto();
        citySeedDto1.setCityName("Burgas");
        citySeedDto1.setPostalCode("8000");

        cityService.createCity(citySeedDto1);
//
//
        AddressSeedDtoWithCity dto =
                new AddressSeedDtoWithCity(citySeedDto,"19a","kurStreet");

        addressService.createAddress(dto);

//       CityViewDto cityViewDto = cityService.findByCityName("Varna");
//        System.out.println(cityViewDto.getId() + " "+ cityViewDto.getCityName());

//        AddressSeedDto addressSeedDto = new AddressSeedDto();
//        addressSeedDto.setCity("123");
//        addressSeedDto.setHouseNumber("asd211");
//        addressSeedDto.setStreetName("asd");
//        addressService.createAddress(addressSeedDto);
//        System.out.println();

//        Set<Account> acc = new HashSet<Account>();
//        Set<Account> acc1 = new HashSet<Account>();
//
//
//        UserSeedDto userSeedDto = new UserSeedDto();
//
//        userSeedDto.setFirstName("Ivan");
//        userSeedDto.setLastName("Ivanonv");
//        userSeedDto.setPhone("1234");
//        userSeedDto.setEgn("9999999999");
//        userSeedDto.setEmail("testEmail@gmail.com");
//        userSeedDto.setUserType(UserType.NONE);
        //user.setUserSubscriptions();

//        Account account = new Account();
//        account.setIban("96262ad52a25a");
//        account.setOwner(user);
//        account.setAccountType(AccountType.CHECKING);
//        account.setBalance(new BigDecimal(5000));
        //account.setCurrency();

        //add accounts
//        acc.add(account);
//        user.setAccounts(acc);
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
//        acc1.add(account1);
//        user1.setAccounts(acc1);
//
//
//        Transaction transaction = new Transaction();
//        transaction.setSender(account);
//        transaction.setRecipient(account1);
//        transaction.setAmount(new BigDecimal(500));
//        transaction.setDateCreated(Instant.now());

//        userService.createUser(userSeedDto);

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
//

    }
}
