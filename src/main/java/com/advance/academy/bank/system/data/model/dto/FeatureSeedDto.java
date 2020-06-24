package com.advance.academy.bank.system.data.model.dto;

public class FeatureSeedDto {

    private String description;
    private Long price;


    public FeatureSeedDto() {
    }


    public FeatureSeedDto(String description, Long price) {
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
