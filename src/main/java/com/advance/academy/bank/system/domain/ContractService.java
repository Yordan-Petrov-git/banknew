package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.Contract;
import com.advance.academy.bank.system.data.model.dto.ContractSeedDto;
import com.advance.academy.bank.system.data.model.dto.ContractViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContractService {

    void createContract(ContractSeedDto contractSeedDto);

    void updateContract(ContractSeedDto contractSeedDto);

    ContractViewDto getContractById(long id);

    List<ContractViewDto> getAllContracts();

    void deleteContractById(long id);


}
