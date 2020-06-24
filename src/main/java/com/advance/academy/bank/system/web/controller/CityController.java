package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.dto.CitySeedDto;
import com.advance.academy.bank.system.data.model.dto.CityViewDto;
import com.advance.academy.bank.system.domain.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cities")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }


    @PostMapping
    public void createCity(@RequestBody CitySeedDto citySeedDto) {
        cityService.createCity(citySeedDto);
    }

    @PutMapping
    public void updateCity(@RequestBody CitySeedDto citySeedDto) {
        cityService.updateCity(citySeedDto);
    }

    @GetMapping
    public List<CityViewDto> getCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public CityViewDto getCity(@PathVariable("id") Long id) {
        return cityService.getCityById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable("id") Long id) {
        cityService.deleteCityById(id);
    }

}
