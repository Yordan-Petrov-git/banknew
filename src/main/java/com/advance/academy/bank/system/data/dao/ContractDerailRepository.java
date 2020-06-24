package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractDerailRepository extends JpaRepository<ContractDetail, Long> {

    ContractDetail  findById (long id);

}
