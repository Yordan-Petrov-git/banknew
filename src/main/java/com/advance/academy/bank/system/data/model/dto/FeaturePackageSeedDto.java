package com.advance.academy.bank.system.data.model.dto;



import java.util.HashSet;
import java.util.Set;

public class FeaturePackageSeedDto {

    private String description;
    private String name;
    private Long price;
    private Set<FeatureViewDto> features = new HashSet<>();

    public FeaturePackageSeedDto() {

    }

    public FeaturePackageSeedDto(String description, String name, Long price, Set<FeatureViewDto> features) {
        this.description = description;
        this.name = name;
        this.price = price;
        this.features = features;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Set<FeatureViewDto> getFeatures() {
        return this.features;
    }

    public void setFeatures(Set<FeatureViewDto> features) {
        this.features = features;
    }
}



