package com.advance.academy.bank.system.data.models;

public class FeatureViewDto {

    private String description;
    private Long price;

    public FeatureViewDto() {
    }


    public FeatureViewDto(String description, Long price) {
        this.description = description;
        this.price = price;
    }


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
