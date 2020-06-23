package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Address;
import com.advance.academy.bank.system.data.dao.AddressRepository;
import com.advance.academy.bank.system.data.model.City;
import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.data.model.dto.AddressSeedDto;
import com.advance.academy.bank.system.data.model.dto.AddressViewDto;
import com.advance.academy.bank.system.data.model.dto.CitySeedDto;
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

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, ModelMapper modelMapper) {
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createAddress(AddressSeedDto addressSeedDto) {

        Address address = this.modelMapper.map(addressSeedDto, Address.class);

        this.addressRepository.save(address);

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
