package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.dao.FeaturePackageRepository;
import com.advance.academy.bank.system.data.model.FeaturePackage;
import com.advance.academy.bank.system.data.model.dto.FeaturePackageSeedDto;
import com.advance.academy.bank.system.data.model.dto.FeaturePackageViewDto;
import com.advance.academy.bank.system.domain.FeaturePackageService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeaturePackageServiceImpl implements FeaturePackageService {

    private final ModelMapper modelMapper;
    private final FeaturePackageRepository featurePackageRepository;

    @Autowired
    public FeaturePackageServiceImpl(ModelMapper modelMapper, FeaturePackageRepository featurePackageRepository) {
        this.modelMapper = modelMapper;
        this.featurePackageRepository = featurePackageRepository;
    }


    @Override
    public void createFeaturePackage(FeaturePackageSeedDto featurePackageSeedDto) {
        FeaturePackage featurePackage = this.modelMapper.map(featurePackageSeedDto, FeaturePackage.class);
        this.featurePackageRepository.save(featurePackage);
    }

    @Override
    public void updateFeaturePackage(FeaturePackageSeedDto featurePackageSeedDto) {

    }

    @Override
    public FeaturePackageViewDto getFeaturePackageById(long id) {
        return this.modelMapper
                .map(this.featurePackageRepository.findById(id), FeaturePackageViewDto.class);
    }

    @Override
    public List<FeaturePackageViewDto> getAllFeaturePackages() {
        List<FeaturePackage> featurePackages = featurePackageRepository.findAll();

        return modelMapper.map(featurePackages, new TypeToken<List<FeaturePackageViewDto>>() {
        }.getType());
    }

    @Override
    public void deleteFeaturePackageById(long id) {

    }
}
