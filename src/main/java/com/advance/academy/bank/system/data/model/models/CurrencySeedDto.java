package com.advance.academy.bank.system.data.model.models;

public class CurrencySeedDto {


    private String name;
    private String iso2;
    private String iso3;
    private Integer multiplierForCurrency;


    public CurrencySeedDto() {
    }

    public CurrencySeedDto(String name, String iso2, String iso3, Integer multiplierForCurrency) {
        this.name = name;
        this.iso2 = iso2;
        this.iso3 = iso3;
        this.multiplierForCurrency = multiplierForCurrency;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso2() {
        return this.iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return this.iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public Integer getMultiplierForCurrency() {
        return this.multiplierForCurrency;
    }

    public void setMultiplierForCurrency(Integer multiplierForCurrency) {
        this.multiplierForCurrency = multiplierForCurrency;
    }
}
