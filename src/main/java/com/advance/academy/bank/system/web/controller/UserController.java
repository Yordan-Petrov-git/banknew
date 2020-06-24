package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.data.model.dto.UserSeedDto;
import com.advance.academy.bank.system.data.model.dto.UserViewDto;
import com.advance.academy.bank.system.domain.UserService;
import com.advance.academy.bank.system.domain.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUser(@RequestBody UserSeedDto userSeedDto) {
        userService.createUser(userSeedDto);
    }

    @PutMapping
    public void updateUser(@RequestBody UserSeedDto userSeedDto) {

    }

    @GetMapping()
    public List<UserViewDto> getUsers() {
        return userService.getAllUsers();
    }


    @GetMapping("/{id}")
    public UserViewDto getUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }
}


