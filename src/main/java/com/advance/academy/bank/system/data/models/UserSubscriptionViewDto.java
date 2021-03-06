package com.advance.academy.bank.system.data.models;

import java.util.HashSet;
import java.util.Set;

public class UserSubscriptionViewDto {

    private Set<FeatureViewDto> features = new HashSet<>();
    private Set<FeaturePackageViewDto> featurePackages = new HashSet<>();
    private AccountViewDto account;

    public UserSubscriptionViewDto() {
    }

    public UserSubscriptionViewDto(Set<FeatureViewDto> features, Set<FeaturePackageViewDto> featurePackages, AccountViewDto account) {
        this.features = features;
        this.featurePackages = featurePackages;
        this.account = account;
    }

    public Set<FeatureViewDto> getFeatures() {
        return this.features;
    }

    public void setFeatures(Set<FeatureViewDto> features) {
        this.features = features;
    }

    public Set<FeaturePackageViewDto> getFeaturePackages() {
        return this.featurePackages;
    }

    public void setFeaturePackages(Set<FeaturePackageViewDto> featurePackages) {
        this.featurePackages = featurePackages;
    }

    public AccountViewDto getAccount() {
        return this.account;
    }

    public void setAccount(AccountViewDto account) {
        this.account = account;
    }

}
