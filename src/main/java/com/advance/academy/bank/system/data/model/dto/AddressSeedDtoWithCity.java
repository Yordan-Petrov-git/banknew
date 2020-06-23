package com.advance.academy.bank.system.data.model.dto;

public class AddressSeedDtoWithCity {

    private CitySeedDto city;
    private String houseNumber;
    private String streetName;


    public AddressSeedDtoWithCity(CitySeedDto city, String houseNumber, String streetName) {
        this.city = city;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }


    public AddressSeedDtoWithCity() {
    }

    public CitySeedDto getCity() {
        return this.city;
    }

    public void setCity(CitySeedDto city) {
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
