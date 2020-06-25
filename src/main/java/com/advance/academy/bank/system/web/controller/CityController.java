package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.models.CitySeedDto;
import com.advance.academy.bank.system.data.models.CityViewDto;
import com.advance.academy.bank.system.domain.services.CityService;
import com.advance.academy.bank.system.exeption.InvalidEntityException;
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


    @PostMapping()
    public void createCity(@RequestBody CitySeedDto citySeedDto) {
        cityService.createCity(citySeedDto);
    }

    @PutMapping("/{id}")
    public void updateCity(@PathVariable Long id, @RequestBody CitySeedDto citySeedDto) {
        //   cityService.updateCity(citySeedDto);


        if (!citySeedDto.getId().equals(id)) {
            throw new InvalidEntityException(
                    String.format("There is no City with ID %s ", id));
        }

        this.cityService.updateCity(citySeedDto);


        // log.info("User updated: {}", updated);
        //  return ResponseEntity.ok(updated);


    }

    @GetMapping()
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
