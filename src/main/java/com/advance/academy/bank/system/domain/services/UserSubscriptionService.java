package com.advance.academy.bank.system.domain.services;

import com.advance.academy.bank.system.data.models.UserSubscriptionSeedDto;
import com.advance.academy.bank.system.data.models.UserSubscriptionViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserSubscriptionService {


    void createUserSubscription(UserSubscriptionSeedDto userSubscription);

    void updateUserSubscription(UserSubscriptionSeedDto userSubscription);

    UserSubscriptionViewDto getUserSubscriptionById(long id);

    List<UserSubscriptionViewDto> getAllUserSubscriptions();

    void deleteUserSubscriptionById(long id);

}

