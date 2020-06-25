package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.models.BankSeedDto;
import com.advance.academy.bank.system.data.models.BankViewDto;
import com.advance.academy.bank.system.domain.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/banks")
public class BankController {

    private final BankService bankService;


    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }


    @PostMapping
    public void createBank(@RequestBody BankSeedDto bank) {
//        validateBank(bank);
//        if (null != bank.getAddress()) {
//
//        }
        bankService.createBank(bank);
    }

//    private void validateBank(BankSeedDto bank) {
//        if (null == bank.getAddress()) {
//            throw new IllegalArgumentException("Invalid bank address");
//        }
//}

    @PutMapping
    public void updateBank(@RequestBody BankSeedDto bank) {

    }

    @GetMapping
    public List<BankViewDto> getBnaks() {
        return bankService.getAllBanks();
    }

    @GetMapping("/{id}")
    public BankViewDto getBank(@PathVariable("id") Long id) {
        return bankService.getBankById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBank(@PathVariable("id") Long id) {
        bankService.deleteBankById(id);
    }


}
