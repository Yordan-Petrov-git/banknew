package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.FeaturePackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturePackageRepository extends JpaRepository<FeaturePackage, Long> {

    FeaturePackage findById(long id);
}
