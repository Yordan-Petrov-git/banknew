package com.advance.academy.bank.system.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "currencies")
public class Currency extends BaseEntity {


    private String name;
    private String iso2;
    private String iso3;
    private Integer multiplierForCurrency;

    public Currency() {
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "iso_2")
    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    @Column(name = "iso_3")
    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    @Column(name = "multiplier_currency")
    public Integer getMultiplierForCurrency() {
        return multiplierForCurrency;
    }

    public void setMultiplierForCurrency(Integer multiplierForCurrency) {
        this.multiplierForCurrency = multiplierForCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency)) return false;
        Currency currency = (Currency) o;
        return Objects.equals(name, currency.name) &&
                Objects.equals(iso2, currency.iso2) &&
                Objects.equals(iso3, currency.iso3) &&
                Objects.equals(multiplierForCurrency, currency.multiplierForCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, iso2, iso3, multiplierForCurrency);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Currency{");
        sb.append("name='").append(name).append('\'');
        sb.append(", iso2='").append(iso2).append('\'');
        sb.append(", iso3='").append(iso3).append('\'');
        sb.append(", multiplierForCurrency=").append(multiplierForCurrency);
        sb.append('}');
        return sb.toString();
    }
}

