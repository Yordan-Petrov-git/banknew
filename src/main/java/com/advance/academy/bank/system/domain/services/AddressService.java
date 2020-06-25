package com.advance.academy.bank.system.domain.services;


import com.advance.academy.bank.system.data.models.AddressSeedDto;
import com.advance.academy.bank.system.data.models.AddressViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    void createAddress(AddressSeedDto addressSeedDto);

    void updateAddress(AddressSeedDto addressSeedDto);

    List<AddressViewDto> getAllAddresses();

    AddressViewDto getAddressById(long id);

    void deleteAddressById(long id);

}
