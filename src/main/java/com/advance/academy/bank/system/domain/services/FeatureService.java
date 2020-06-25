package com.advance.academy.bank.system.domain.services;

import com.advance.academy.bank.system.data.models.FeatureSeedDto;
import com.advance.academy.bank.system.data.models.FeatureViewDto;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface FeatureService {


    void createFeature(FeatureSeedDto featureSeedDto);

    void updateFeature(FeatureSeedDto featureSeedDto);

    FeatureViewDto getFeatureById(long id);

    List<FeatureViewDto> getAllFeatures();

    void deleteFeatureById(long id);

}
