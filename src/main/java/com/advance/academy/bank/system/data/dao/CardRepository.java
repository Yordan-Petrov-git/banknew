package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
