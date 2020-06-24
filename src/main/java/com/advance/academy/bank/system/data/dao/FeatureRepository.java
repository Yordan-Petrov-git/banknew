package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepository extends JpaRepository<Feature,Long> {

    Feature  findById (long id);
}
