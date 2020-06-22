package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.data.dao.UserRepository;
import com.advance.academy.bank.system.domain.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        //TODO ADD UPDATE
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }
}
