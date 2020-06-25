package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.models.ContractSeedDto;
import com.advance.academy.bank.system.data.model.models.ContractViewDto;
import com.advance.academy.bank.system.domain.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contracts")
public class ContractController {

    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @PostMapping
    public void createContract(@RequestBody ContractSeedDto contractSeedDto) {
        contractService.createContract(contractSeedDto);
    }

    @PutMapping
    public void updateContract(@RequestBody ContractSeedDto contractSeedDto) {
        contractService.updateContract(contractSeedDto);
    }

    @GetMapping
    public List<ContractViewDto> getContracts() {
        return contractService.getAllContracts();
    }

    @GetMapping("/{id}")
    public ContractViewDto getContract(@PathVariable("id") Long id) {
        return contractService.getContractById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteContract(@PathVariable("id") Long id) {
        contractService.deleteContractById(id);
    }

}
