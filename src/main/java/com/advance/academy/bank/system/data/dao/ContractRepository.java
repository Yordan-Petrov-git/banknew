package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

    Contract  findById (long id);

}
