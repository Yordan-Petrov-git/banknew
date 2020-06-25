package com.advance.academy.bank.system.web.controller;

import com.advance.academy.bank.system.data.model.models.UserSeedDto;
import com.advance.academy.bank.system.data.model.models.UserViewDto;
import com.advance.academy.bank.system.domain.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/register")
    public ResponseEntity<UserSeedDto> createUser(@RequestBody UserSeedDto userSeedDto) {
         userService.createUser(userSeedDto);
        return new ResponseEntity<>(userSeedDto, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") Long id,@RequestBody UserSeedDto userSeedDto) {
        userService.updateUser(userSeedDto);
    }


    @GetMapping("/{id}")
    public UserViewDto getUser(@PathVariable("id")final Long id) {
        return userService.getUserById(id);
    }

    @GetMapping()
    public List<UserViewDto> getUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }
}


