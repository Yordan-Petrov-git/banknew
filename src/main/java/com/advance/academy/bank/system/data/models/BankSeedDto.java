package com.advance.academy.bank.system.data.models;

public class BankSeedDto {

    private String name;
    private AddressViewDto address;
    private String swiftNumber;
    //private Map<String, Object> additionalInfo = new HashMap<>();


    public BankSeedDto() {
    }

    public BankSeedDto(String name, AddressViewDto address, String swiftNumber) {
        this.name = name;
        this.address = address;
        this.swiftNumber = swiftNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressViewDto getAddress() {
        return this.address;
    }

    public void setAddress(AddressViewDto address) {
        this.address = address;
    }

    public String getSwiftNumber() {
        return this.swiftNumber;
    }

    public void setSwiftNumber(String swiftNumber) {
        this.swiftNumber = swiftNumber;
    }
}
