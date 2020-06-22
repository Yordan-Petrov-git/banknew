package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.City;
import com.advance.academy.bank.system.data.model.contract.Contract;
import com.advance.academy.bank.system.data.dao.CityRepository;
import com.advance.academy.bank.system.domain.CityService;
import com.advance.academy.bank.system.domain.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }


    @Override
    public void createCity(City city) {
        cityRepository.save(city);
    }

    @Override
    public void updateCity(City city) {
  //TODO UPDATE CITY
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City getCityById(long id) {
        return cityRepository.getOne(id);
    }

    @Override
    public void deleteCityById(long id) {
       cityRepository.deleteById(id);
    }
}
