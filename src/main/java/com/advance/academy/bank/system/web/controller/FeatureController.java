package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.Account;
import com.advance.academy.bank.system.data.model.Feature;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/features")
public class FeatureController {


    @PostMapping
    public void createFeature(@RequestBody Feature feature) {

    }

    @PutMapping
    public void updateFeature(@RequestBody Feature feature) {

    }

    @GetMapping
    public List<Feature> getFeatures() {
        return null;
    }


    @GetMapping("/{id}")
    public Feature getFeature(@PathVariable("id") Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteFeature(@PathVariable("id") Long id) {

    }
}
