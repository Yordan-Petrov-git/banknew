package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.dto.FeaturePackageSeedDto;
import com.advance.academy.bank.system.data.model.dto.FeaturePackageViewDto;


import java.util.List;

public interface FeaturePackageService {


    void createFeaturePackage(FeaturePackageSeedDto featurePackageSeedDto);

    void updateFeaturePackage(FeaturePackageSeedDto featurePackageSeedDto);

    FeaturePackageViewDto getFeaturePackageById(long id);

    List<FeaturePackageViewDto> getAllFeaturePackages();

    void deleteFeaturePackageById(long id);


}
