package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.dao.UserSubscriptionRepository;
import com.advance.academy.bank.system.data.model.Feature;
import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.data.model.UserSubscription;
import com.advance.academy.bank.system.data.model.dto.FeatureViewDto;
import com.advance.academy.bank.system.data.model.dto.UserSubscriptionSeedDto;
import com.advance.academy.bank.system.data.model.dto.UserSubscriptionViewDto;
import com.advance.academy.bank.system.domain.UserSubscriptionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserSubscriptionImpl implements UserSubscriptionService {

    private final ModelMapper modelMapper;
    private final UserSubscriptionRepository userSubscriptionRepository;

    @Autowired
    public UserSubscriptionImpl(ModelMapper modelMapper, UserSubscriptionRepository userSubscriptionRepository) {
        this.modelMapper = modelMapper;
        this.userSubscriptionRepository = userSubscriptionRepository;
    }

    @Override
    public void createUserSubscription(UserSubscriptionSeedDto userSubscriptionSeedDto) {
        UserSubscription userSubscription = this.modelMapper.map(userSubscriptionSeedDto, UserSubscription.class);
        this.userSubscriptionRepository.save(userSubscription);
    }

    @Override
    public void updateUserSubscription(UserSubscriptionSeedDto userSubscriptionSeedDto) {

    }

    @Override
    public UserSubscriptionViewDto getUserSubscriptionById(long id) {
        return this.modelMapper
                .map(this.userSubscriptionRepository.findById(id), UserSubscriptionViewDto.class);
    }

    @Override
    public List<UserSubscriptionViewDto> getAllUserSubscriptions() {
        List<UserSubscription> userSubscriptions = userSubscriptionRepository.findAll();

        return modelMapper.map(userSubscriptions, new TypeToken<List<UserSubscriptionViewDto>>() {
        }.getType());
    }

    @Override
    public void deleteUserSubscriptionById(long id) {

    }
}
