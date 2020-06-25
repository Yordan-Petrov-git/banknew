package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.models.FeaturePackageSeedDto;
import com.advance.academy.bank.system.data.model.models.FeaturePackageViewDto;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface FeaturePackageService {


    void createFeaturePackage(FeaturePackageSeedDto featurePackageSeedDto);

    void updateFeaturePackage(FeaturePackageSeedDto featurePackageSeedDto);

    FeaturePackageViewDto getFeaturePackageById(long id);

    List<FeaturePackageViewDto> getAllFeaturePackages();

    void deleteFeaturePackageById(long id);


}
