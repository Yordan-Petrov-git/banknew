package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.dto.UserSubscriptionSeedDto;
import com.advance.academy.bank.system.data.model.dto.UserSubscriptionViewDto;
import com.advance.academy.bank.system.domain.UserSubscriptionService;
import com.advance.academy.bank.system.domain.impl.UserSubscriptionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/subscriptions")
public class UserSubscriptionController {


    private final UserSubscriptionService userSubscriptionService;

    @Autowired
    public UserSubscriptionController(UserSubscriptionService userSubscriptionService) {
        this.userSubscriptionService = userSubscriptionService;
    }

    @PostMapping
    public void createUserSubscription(@RequestBody UserSubscriptionSeedDto userSubscriptionSeedDto) {
        userSubscriptionService.createUserSubscription(userSubscriptionSeedDto);
    }

    @PutMapping
    public void updateUserSubscription(@RequestBody UserSubscriptionSeedDto userSubscriptionSeedDto) {

    }

    @GetMapping
    public List<UserSubscriptionViewDto> getUserSubscriptions() {
        return userSubscriptionService.getAllUserSubscriptions();
    }

    @GetMapping("/{id}")
    public UserSubscriptionViewDto getUserSubscription(@PathVariable("id") Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUserSubscription(@PathVariable("id") Long id) {

    }

}
