package com.advance.academy.bank.system.rest.controller;

import com.advance.academy.bank.system.data.models.ContractDetailSeedDto;
import com.advance.academy.bank.system.data.models.ContractDetailViewDto;
import com.advance.academy.bank.system.domain.services.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contractdetails")
public class ContractDetailController {

    private final ContractDetailService contractDetailService;

    @Autowired
    public ContractDetailController(ContractDetailService contractDetailService) {
        this.contractDetailService = contractDetailService;
    }


    @PostMapping
    public void createContractDetail(@RequestBody ContractDetailSeedDto contractDetailSeedDto) {
        contractDetailService.createContractDetail(contractDetailSeedDto);
    }

    @PutMapping
    public void updateContractDetail(@RequestBody ContractDetailSeedDto contractDetailSeedDto) {
        contractDetailService.updateContractDetail(contractDetailSeedDto);
    }

    @GetMapping
    public List<ContractDetailViewDto> getContractDetails() {
        return contractDetailService.getAllContractDetails();
    }

    @GetMapping("/{id}")
    public ContractDetailViewDto getContractDetail(@PathVariable("id") Long id) {
        return contractDetailService.getContractDetailById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteContractDetail(@PathVariable("id") Long id) {
        contractDetailService.deleteContractDetailById(id);
    }
}
