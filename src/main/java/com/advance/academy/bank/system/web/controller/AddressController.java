package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.Address;
import com.advance.academy.bank.system.data.model.dto.AddressSeedDto;
import com.advance.academy.bank.system.data.model.dto.AddressSeedDtoWithCity;
import com.advance.academy.bank.system.data.model.dto.AddressViewDto;
import com.advance.academy.bank.system.domain.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {

    private final AddressServiceImpl addressService;

    @Autowired
    public AddressController(AddressServiceImpl addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public void createAddress(@RequestBody AddressSeedDtoWithCity address) {
        addressService.createAddress(address);
    }

    @PutMapping
    public void updateAddress(@RequestBody AddressSeedDto address) {

    }

    @GetMapping
    public List<AddressViewDto> getAddress() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public AddressViewDto getAddress(@PathVariable("id") Long id) {
        return addressService.getAddressById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable("id") Long id) {
        addressService.deleteAddressById(id);
    }

}
