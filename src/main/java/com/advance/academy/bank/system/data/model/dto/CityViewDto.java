package com.advance.academy.bank.system.data.model.dto;

public class CityViewDto {


    private long id;
    private String cityName;
    private String postalCode;

    public CityViewDto() {
    }

    public CityViewDto(String cityName, String postalCode) {
        this.cityName = cityName;
        this.postalCode = postalCode;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
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
