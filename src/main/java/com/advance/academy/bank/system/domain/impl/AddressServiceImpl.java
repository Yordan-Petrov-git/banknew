package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Address;
import com.advance.academy.bank.system.data.dao.AddressRepository;
import com.advance.academy.bank.system.data.model.City;
import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.data.model.dto.AddressSeedDto;
import com.advance.academy.bank.system.data.model.dto.AddressSeedDtoWithCity;
import com.advance.academy.bank.system.data.model.dto.AddressViewDto;
import com.advance.academy.bank.system.data.model.dto.CityViewDto;
import com.advance.academy.bank.system.domain.AddressService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;
    private final CityServiceImpl cityService;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, ModelMapper modelMapper, CityServiceImpl cityService) {
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
        this.cityService = cityService;
    }

    @Override
    public void createAddress(AddressSeedDto addressSeedDto) {

        Address address = this.modelMapper.map(addressSeedDto, Address.class);

        CityViewDto city = this.cityService.findByCityName(addressSeedDto.getCity());

        address.setCity(this.modelMapper.map(city, City.class));

        this.addressRepository.save(address);
//--------------------------------

//        Address address = this.modelMapper.map(addressSeedDto, Address.class);
//
//
//        this.addressRepository.save(address);
//


    }

    @Override
    public void updateAddress(AddressSeedDto address) {
        //TODO ADD UPDATE
    }

    @Override
    public List<AddressViewDto> getAllAddresses() {
        List<Address> addresses = addressRepository.findAll();
        return modelMapper.map(addresses, new TypeToken<List<AddressViewDto>>() {
        }.getType());
    }

    @Override
    public AddressViewDto getAddressById(long id) {
        return this.modelMapper
                .map(this.addressRepository.findById(id), AddressViewDto.class);
    }

    @Override
    public void deleteAddressById(long id) {
        addressRepository.deleteById(id);
    }
}
