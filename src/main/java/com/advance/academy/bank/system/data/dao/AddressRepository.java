package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findById(long id);

}
