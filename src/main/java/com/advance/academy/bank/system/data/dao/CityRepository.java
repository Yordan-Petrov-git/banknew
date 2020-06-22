package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
}
