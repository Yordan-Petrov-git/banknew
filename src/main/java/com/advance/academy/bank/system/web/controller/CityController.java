package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.City;
import com.advance.academy.bank.system.domain.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cities")
public class CityController {

    private final CityServiceImpl cityService;

    @Autowired
    public CityController(CityServiceImpl cityService) {
        this.cityService = cityService;
    }


    @PostMapping
    public void createCity(@RequestBody City city) {
        cityService.createCity(city);
    }

    @PutMapping
    public void updateCity(@RequestBody City city) {

    }

    @GetMapping
    public List<City> getCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public City getCity(@PathVariable("id") Long id) {
        return cityService.getCityById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable("id") Long id) {
        cityService.deleteCityById(id);
    }

}
