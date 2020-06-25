package com.advance.academy.bank.system.data.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "addresses")
public class Address extends BaseEntity {


    private City city;
    private String houseNumber;
    private String streetName;

    public Address() {
    }

    @ManyToOne(targetEntity = City.class,
            fetch = FetchType.LAZY)
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        if (!super.equals(o)) return false;
        Address address = (Address) o;
        return
                Objects.equals(houseNumber, address.houseNumber) &&
                Objects.equals(streetName, address.streetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), houseNumber, streetName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append(", houseNumber='").append(houseNumber).append('\'');
        sb.append(", streetName='").append(streetName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
