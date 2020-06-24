package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.dao.ContractDerailRepository;
import com.advance.academy.bank.system.data.model.ContractDetail;
import com.advance.academy.bank.system.data.model.dto.ContractDetailSeedDto;
import com.advance.academy.bank.system.data.model.dto.ContractDetailViewDto;
import com.advance.academy.bank.system.domain.ContractDetailService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {


    private final ContractDerailRepository contractDerailRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ContractDetailServiceImpl(ModelMapper modelMapper, ContractDerailRepository contractDerailRepository) {
        this.contractDerailRepository = contractDerailRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createContractDetail(ContractDetailSeedDto contractDetailSeedDto) {
        ContractDetail contractDetail = this.modelMapper.map(contractDetailSeedDto, ContractDetail.class);
        this.contractDerailRepository.save(contractDetail);
    }

    @Override
    public void updateContractDetail(ContractDetailSeedDto contractDetailSeedDto) {

    }

    @Override
    public ContractDetailViewDto getContractDetailById(long id) {
        return this.modelMapper
                .map(this.contractDerailRepository.findById(id), ContractDetailViewDto.class);
    }

    @Override
    public List<ContractDetailViewDto> getAllContractDetails() {
        List<ContractDetail> contractDetails = contractDerailRepository.findAll();

        return modelMapper.map(contractDetails, new TypeToken<List<ContractDetailViewDto>>() {
        }.getType());
    }

    @Override
    public void deleteContractDetailById(long id) {

    }
}
