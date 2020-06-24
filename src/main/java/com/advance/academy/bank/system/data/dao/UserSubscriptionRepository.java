package com.advance.academy.bank.system.data.dao;

import com.advance.academy.bank.system.data.model.UserSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSubscriptionRepository extends JpaRepository<UserSubscription, Long> {

    UserSubscription findById(long id);
}
