package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.domain.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/contract/details")
public class ContractDetailController {

    private final ContractDetailService contractDetailService;

    @Autowired
    public ContractDetailController(ContractDetailService contractDetailService) {
        this.contractDetailService = contractDetailService;
    }



}
