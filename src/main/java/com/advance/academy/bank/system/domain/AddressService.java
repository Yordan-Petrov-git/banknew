package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    void createAddress(Address address);

    void updateAddress(Address address);

    List<Address> getAllAddresses();

    Address getAddressById(long id);

    void deleteAddressById(long id);

}
