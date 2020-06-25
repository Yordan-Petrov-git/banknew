package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.dao.FeatureRepository;
import com.advance.academy.bank.system.data.model.Feature;;
import com.advance.academy.bank.system.data.model.models.FeatureSeedDto;
import com.advance.academy.bank.system.data.model.models.FeatureViewDto;
import com.advance.academy.bank.system.domain.FeatureService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureServiceImpl implements FeatureService {

    private final ModelMapper modelMapper;
    private final FeatureRepository featureRepository;

    @Autowired
    public FeatureServiceImpl(ModelMapper modelMapper, FeatureRepository featureRepository) {
        this.modelMapper = modelMapper;
        this.featureRepository = featureRepository;
    }


    @Override
    public void createFeature(FeatureSeedDto featureSeedDto) {
        Feature feature = this.modelMapper.map(featureSeedDto, Feature.class);
        this.featureRepository.save(feature);
    }

    @Override
    public void updateFeature(FeatureSeedDto featureSeedDto) {

    }

    @Override
    public FeatureViewDto getFeatureById(long id) {
        return this.modelMapper
                .map(this.featureRepository.findById(id), FeatureViewDto.class);
    }

    @Override
    public List<FeatureViewDto> getAllFeatures() {
        List<Feature> features = featureRepository.findAll();

        return modelMapper.map(features, new TypeToken<List<FeatureViewDto>>() {
        }.getType());
    }

    @Override
    public void deleteFeatureById(long id) {

    }
}
