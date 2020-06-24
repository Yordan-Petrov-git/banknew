package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.data.dao.UserRepository;
import com.advance.academy.bank.system.data.model.dto.UserSeedDto;
import com.advance.academy.bank.system.data.model.dto.UserViewDto;
import com.advance.academy.bank.system.domain.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void createUser(UserSeedDto userSeedDto) {
        User user = this.modelMapper.map(userSeedDto, User.class);
        this.userRepository.save(user);
    }

    @Override
    public void updateUser(UserSeedDto userSeedDto) {
        //TODO ADD UPDATE
    }

    @Override
    public UserViewDto getUserById(long id) {
        return this.modelMapper
                .map(this.userRepository.findById(id), UserViewDto.class);
    }

    @Override
    public List<UserViewDto> getAllUsers() {

        List<User> users = userRepository.findAll();

        return modelMapper.map(users, new TypeToken<List<UserViewDto>>() {
        }.getType());
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }
}
