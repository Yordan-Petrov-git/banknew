package com.advance.academy.bank.system.data.models;

public class AddressSeedDto {

    private String city;
    private String houseNumber;
    private String streetName;

    public AddressSeedDto(String city, String houseNumber, String streetName) {
        this.city = city;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }

    public AddressSeedDto() {
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
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
