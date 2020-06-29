package com.advance.academy.bank.system.rest.controller;

import com.advance.academy.bank.system.data.models.FeaturePackageSeedDto;
import com.advance.academy.bank.system.data.models.FeaturePackageViewDto;
import com.advance.academy.bank.system.domain.services.FeaturePackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/packages")
public class FeaturePackageController {

    private final FeaturePackageService featurePackageService;

    @Autowired
    public FeaturePackageController(FeaturePackageService featurePackageService) {
        this.featurePackageService = featurePackageService;
    }


    @PostMapping
    public void createFeaturePackage(@RequestBody FeaturePackageSeedDto featurePackage) {

    }

    @PutMapping
    public void updateFeaturePackage(@RequestBody FeaturePackageSeedDto featurePackage) {

    }

    @GetMapping
    public List<FeaturePackageViewDto> getFeaturePackages() {
        return featurePackageService.getAllFeaturePackages();
    }


    @GetMapping("/{id}")
    public FeaturePackageViewDto getFeaturePackage(@PathVariable("id") Long id) {

        return featurePackageService.getFeaturePackageById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFeaturePackage(@PathVariable("id") Long id) {
        featurePackageService.deleteFeaturePackageById(id);
    }

}
