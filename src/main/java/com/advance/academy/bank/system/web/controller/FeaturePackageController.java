package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.data.model.FeaturePackage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/packages")
public class FeaturePackageController {



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
