package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {

    void createCity(City city);

    void updateCity(City city);

    List<City> getAllCities();

    City getCityById(long id);

    void deleteCityById(long id);

}
