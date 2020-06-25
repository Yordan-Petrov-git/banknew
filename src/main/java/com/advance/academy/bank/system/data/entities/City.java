package com.advance.academy.bank.system.data.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City extends BaseEntity {


    private String cityName;
    private String postalCode;


    public City() {
    }

    @Column(name = "city_name")
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Column(name = "postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("cityName='").append(cityName).append('\'');
        sb.append(", postalCode='").append(postalCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
