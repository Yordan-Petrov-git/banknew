package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.Contract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContractService {

    void createContract(Contract contract);

    void updateContract(Contract contract);

    List<Contract> getAllContracts();

    Contract getContractById(long id);

    void deleteContractById(long id);

}
