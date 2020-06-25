package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {

    City findById (long id);

    City findByCityName (String name);

}
