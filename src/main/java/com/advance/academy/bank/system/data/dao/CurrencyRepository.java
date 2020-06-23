package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

    Currency  findById (long id);
}
