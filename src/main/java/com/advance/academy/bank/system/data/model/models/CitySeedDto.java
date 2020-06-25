package com.advance.academy.bank.system.data.model.models;

public class CitySeedDto {

    private Long id;
    private String cityName;
    private String postalCode;


    public CitySeedDto(String cityName, String postalCode) {
        this.cityName = cityName;
        this.postalCode = postalCode;
    }

    public CitySeedDto() {
    }

    public Long getId() {
        return this.id;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
