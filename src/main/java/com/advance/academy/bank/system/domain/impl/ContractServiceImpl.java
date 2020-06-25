package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Contract;
import com.advance.academy.bank.system.data.dao.ContractRepository;
import com.advance.academy.bank.system.data.model.models.ContractSeedDto;
import com.advance.academy.bank.system.data.model.models.ContractViewDto;
import com.advance.academy.bank.system.domain.ContractService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {


    private final ContractRepository contractRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ContractServiceImpl(ContractRepository contractRepository, ModelMapper modelMapper) {
        this.contractRepository = contractRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public void createContract(ContractSeedDto contractSeedDto) {

        Contract contract = this.modelMapper.map(contractSeedDto, Contract.class);
        this.contractRepository.save(contract);
    }

    @Override
    public void updateContract(ContractSeedDto contractSeedDto) {

    }

    @Override
    public ContractViewDto getContractById(long id) {
        return this.modelMapper
                .map(this.contractRepository.findById(id), ContractViewDto.class);

    }

    @Override
    public List<ContractViewDto> getAllContracts() {
        List<Contract> contracts = contractRepository.findAll();

        return modelMapper.map(contracts, new TypeToken<List<ContractViewDto>>() {
        }.getType());

    }

    @Override
    public void deleteContractById(long id) {

    }
}
