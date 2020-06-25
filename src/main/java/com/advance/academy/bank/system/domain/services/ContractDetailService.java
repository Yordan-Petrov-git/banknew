package com.advance.academy.bank.system.domain.services;

import com.advance.academy.bank.system.data.models.ContractDetailSeedDto;
import com.advance.academy.bank.system.data.models.ContractDetailViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContractDetailService {

    void createContractDetail(ContractDetailSeedDto contractDetailSeedDto);

    void updateContractDetail(ContractDetailSeedDto contractDetailSeedDto);

    ContractDetailViewDto getContractDetailById(long id);

    List<ContractDetailViewDto> getAllContractDetails();

    void deleteContractDetailById(long id);


}
