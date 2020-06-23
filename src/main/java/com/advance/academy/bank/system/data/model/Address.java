package com.advance.academy.bank.system.data.model;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name = "addresses")
public class Address extends BaseEntity {


    private City city;
    private String houseNumber;
    private String streetName;

    public Address() {
    }

    @ManyToOne(targetEntity = City.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Column(name = "house_number")
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Column(name = "street_name")
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("city=").append(city);
        sb.append(", houseNumber='").append(houseNumber).append('\'');
        sb.append(", streetName='").append(streetName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
