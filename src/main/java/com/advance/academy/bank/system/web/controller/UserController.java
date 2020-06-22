package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.domain.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {

    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }


    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {

    }
}


