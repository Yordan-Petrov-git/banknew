package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.dto.CitySeedDto;
import com.advance.academy.bank.system.data.model.dto.CityViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {

    void createCity(CitySeedDto citySeedDto);

    void updateCity(CitySeedDto citySeedDto);

    List<CityViewDto> getAllCities();

    CityViewDto getCityById(long id);

    CityViewDto findByCityName(String name);

    void deleteCityById(long id);

}
