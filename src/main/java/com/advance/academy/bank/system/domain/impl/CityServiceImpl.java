package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.City;
import com.advance.academy.bank.system.data.dao.CityRepository;
import com.advance.academy.bank.system.data.model.dto.CitySeedDto;
import com.advance.academy.bank.system.data.model.dto.CityViewDto;
import com.advance.academy.bank.system.domain.CityService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository, ModelMapper modelMapper) {
        this.cityRepository = cityRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public void createCity(CitySeedDto citySeedDto) {
        City city = this.modelMapper.map(citySeedDto, City.class);
        this.cityRepository.save(city);
    }

    @Override
    public void updateCity(CitySeedDto citySeedDto) {
        //TODO ADD UPDATE METHOD
    }


    @Override
    public List<CityViewDto> getAllCities() {

        List<City> cities = cityRepository.findAll();

        return modelMapper.map(cities, new TypeToken<List<CityViewDto>>() {
        }.getType());
    }

    @Override
    public CityViewDto getCityById(long id) {
        return this.modelMapper
                .map(this.cityRepository.findById(id), CityViewDto.class);
    }

    @Override
    public CityViewDto findByCityName(String name) {
        return this.modelMapper
                .map(this.cityRepository.findByCityName(name), CityViewDto.class);
    }

    @Override
    public void deleteCityById(long id) {
        cityRepository.deleteById(id);
    }
}
