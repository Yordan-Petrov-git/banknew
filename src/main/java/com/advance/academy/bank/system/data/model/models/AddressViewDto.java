package com.advance.academy.bank.system.data.model.models;

public class AddressViewDto {

    private CityViewDto city;
    private String houseNumber;
    private String streetName;


    public AddressViewDto() {
    }

    public AddressViewDto(CityViewDto city, String houseNumber, String streetName) {
        this.city = city;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }


    public CityViewDto getCity() {
        return this.city;
    }

    public void setCity(CityViewDto city) {
        this.city = city;
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
