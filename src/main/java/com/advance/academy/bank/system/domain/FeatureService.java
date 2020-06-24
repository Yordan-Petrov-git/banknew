package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.dto.FeatureSeedDto;
import com.advance.academy.bank.system.data.model.dto.FeatureViewDto;


import java.util.List;

public interface FeatureService {


    void createFeature(FeatureSeedDto featureSeedDto);

    void updateFeature(FeatureSeedDto featureSeedDto);

    FeatureViewDto getFeatureById(long id);

    List<FeatureViewDto> getAllFeatures();

    void deleteFeatureById(long id);

}
