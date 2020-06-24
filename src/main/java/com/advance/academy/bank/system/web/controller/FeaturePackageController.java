package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.FeaturePackage;
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
    public void createFeaturePackage(@RequestBody FeaturePackage featurePackage) {

    }

    @PutMapping
    public void updateFeaturePackage(@RequestBody FeaturePackage featurePackage) {

    }

    @GetMapping
    public List<FeaturePackage> getFeaturePackages() {
        return null;
    }


    @GetMapping("/{id}")
    public FeaturePackage getFeaturePackage(@PathVariable("id") Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteFeaturePackage(@PathVariable("id") Long id) {

    }

}
