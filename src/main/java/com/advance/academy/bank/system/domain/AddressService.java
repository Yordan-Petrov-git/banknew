package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.Address;
import com.advance.academy.bank.system.data.model.dto.AddressSeedDto;
import com.advance.academy.bank.system.data.model.dto.AddressViewDto;
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
