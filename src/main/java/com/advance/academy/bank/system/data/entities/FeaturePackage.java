package com.advance.academy.bank.system.data.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "feature_packages")
public class FeaturePackage extends BaseEntity {

    private String description;
    private String name;
    private Long price;
    private Set<Feature> features = new HashSet<>();

    public FeaturePackage() {
    }

    public String getDescription() {
        return description;
    }

    @Column(name = "description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "price")
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @OneToMany(targetEntity = Feature.class)
    @JoinTable(
            name = "feature_packages_features",
            joinColumns = @JoinColumn(name = "feature_package_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id",referencedColumnName = "id")
    )
    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeaturePackage{");
        sb.append("description='").append(description).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", features=").append(features);
        sb.append('}');
        return sb.toString();
    }
}
