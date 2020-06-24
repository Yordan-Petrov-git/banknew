package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.FeaturePackage;
import com.advance.academy.bank.system.data.model.dto.FeaturePackageSeedDto;
import com.advance.academy.bank.system.data.model.dto.FeaturePackageViewDto;
import com.advance.academy.bank.system.domain.FeaturePackageService;
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
        return null;
    }


    @GetMapping("/{id}")
    public FeaturePackageViewDto getFeaturePackage(@PathVariable("id") Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteFeaturePackage(@PathVariable("id") Long id) {

    }

}
