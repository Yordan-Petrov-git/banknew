package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.dto.UserSeedDto;
import com.advance.academy.bank.system.data.model.dto.UserSubscriptionSeedDto;
import com.advance.academy.bank.system.data.model.dto.UserSubscriptionViewDto;
import com.advance.academy.bank.system.data.model.dto.UserViewDto;

import java.util.List;

public interface UserSubscriptionService {


    void createUserSubscription(UserSubscriptionSeedDto userSubscription);

    void updateUserSubscription(UserSubscriptionSeedDto userSubscription);

    UserSubscriptionViewDto getUserSubscriptionById(long id);

    List<UserSubscriptionViewDto> getAllUserSubscriptions();

    void deleteUserSubscriptionById(long id);

}

