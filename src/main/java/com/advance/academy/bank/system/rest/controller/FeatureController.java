package com.advance.academy.bank.system.rest.controller;

import com.advance.academy.bank.system.data.models.FeatureSeedDto;
import com.advance.academy.bank.system.data.models.FeatureViewDto;
import com.advance.academy.bank.system.domain.services.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/features")
public class FeatureController {

    private final FeatureService featureService;

    @Autowired
    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @PostMapping
    public void createFeature(@RequestBody FeatureSeedDto feature) {

    }

    @PutMapping
    public void updateFeature(@RequestBody FeatureSeedDto feature) {

    }

    @GetMapping
    public List<FeatureViewDto> getFeatures() {
        return featureService.getAllFeatures();
    }


    @GetMapping("/{id}")
    public FeatureViewDto getFeature(@PathVariable("id") Long id) {

        return featureService.getFeatureById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFeature(@PathVariable("id") Long id) {

        featureService.deleteFeatureById(id);
    }
}
