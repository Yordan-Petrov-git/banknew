package com.advance.academy.bank.system.data.model.dto;

public class CityViewDto {

    private String cityName;
    private String postalCode;


    public CityViewDto() {
    }

    public CityViewDto(String cityName, String postalCode) {
        this.cityName = cityName;
        this.postalCode = postalCode;
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
