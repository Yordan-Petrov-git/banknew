package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractDerailRepository extends JpaRepository<ContractDetail, Long> {
}
