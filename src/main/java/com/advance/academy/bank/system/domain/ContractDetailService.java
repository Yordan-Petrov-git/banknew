package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.dto.ContractDetailSeedDto;
import com.advance.academy.bank.system.data.model.dto.ContractDetailViewDto;
import com.advance.academy.bank.system.data.model.dto.FeatureSeedDto;
import com.advance.academy.bank.system.data.model.dto.FeatureViewDto;
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
