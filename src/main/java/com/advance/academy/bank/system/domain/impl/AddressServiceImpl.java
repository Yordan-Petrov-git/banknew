package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.Address;
import com.advance.academy.bank.system.data.dao.AddressRepository;
import com.advance.academy.bank.system.domain.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void createAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void updateAddress(Address address) {
        //TODO ADD UPDATE
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(long id) {
        return addressRepository.getOne(id);
    }

    @Override
    public void deleteAddressById(long id) {
        addressRepository.deleteById(id);
    }
}
