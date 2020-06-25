package com.advance.academy.bank.system.data.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users_subscriptions")
public class UserSubscription extends BaseEntity {

    private Set<Feature> features = new HashSet<>();
    private Set<FeaturePackage> featurePackages = new HashSet<>();
    private Account account;

    public UserSubscription() {
    }

    @ManyToMany(targetEntity = Feature.class,
            cascade = {CascadeType.PERSIST, CascadeType.PERSIST},
            fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_subscriptions_features",
            joinColumns = @JoinColumn(name = "user_subscription_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id", referencedColumnName = "id")
    )
    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    @ManyToMany(targetEntity = FeaturePackage.class,
            cascade = {CascadeType.PERSIST, CascadeType.PERSIST},
            fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_subscriptions_feature_packages",
            joinColumns = @JoinColumn(name = "user_subscription_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "feature_package_is", referencedColumnName = "id")
    )
    public Set<FeaturePackage> getFeaturePackages() {
        return featurePackages;
    }

    public void setFeaturePackages(Set<FeaturePackage> featurePackages) {
        this.featurePackages = featurePackages;
    }

    @ManyToOne(targetEntity = Account.class)
    @JoinTable(name = "account_id")
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserSubscription{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
