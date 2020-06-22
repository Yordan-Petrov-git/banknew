package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.contract.Contract;
import com.advance.academy.bank.system.data.dao.ContractRepository;
import com.advance.academy.bank.system.domain.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContractService {


    private final ContractRepository contractRepository;

    @Autowired
    public ContactServiceImpl(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }


    @Override
    public void createContract(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void updateContract(Contract contract) {
        //TODO ADD UPDATE
    }

    @Override
    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    @Override
    public Contract getContractById(long id) {
        return contractRepository.getOne(id);
    }

    @Override
    public void deleteContractById(long id) {
        contractRepository.deleteById(id);
    }
}
