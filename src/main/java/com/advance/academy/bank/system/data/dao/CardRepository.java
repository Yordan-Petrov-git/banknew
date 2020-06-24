package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    Card  findById (long id);

}
