package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.dto.ContractSeedDto;
import com.advance.academy.bank.system.data.model.dto.ContractViewDto;

import java.util.List;

public interface ContractService {


    void createContract(ContractSeedDto contractSeedDto);

    void updateContract(ContractSeedDto contractSeedDto);

    ContractViewDto getContractById(long id);

    List<ContractViewDto> getAllContracts();

    void deleteContractById(long id);

}
