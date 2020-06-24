package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.UserSubscription;
import com.advance.academy.bank.system.domain.UserSubscriptionService;
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
    public void createUserSubscription(@RequestBody UserSubscription userSubscription) {

    }

    @PutMapping
    public void updateUserSubscription(@RequestBody UserSubscription userSubscription) {

    }

    @GetMapping
    public List<UserSubscription> getUserSubscriptions() {
        return null;
    }

    @GetMapping("/{id}")
    public UserSubscription getUserSubscription(@PathVariable("id") Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUserSubscription(@PathVariable("id") Long id) {

    }

}
