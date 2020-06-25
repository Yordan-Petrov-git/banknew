package com.advance.academy.bank.system.domain.services;

import com.advance.academy.bank.system.data.entities.User;
import com.advance.academy.bank.system.data.models.UserSeedDto;
import com.advance.academy.bank.system.data.models.UserViewDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends UserDetailsService  {

    UserSeedDto createUser(UserSeedDto user);

    void updateUser(UserSeedDto user);

    UserViewDto getUserById(long id);

    List<UserViewDto> getAllUsers();

    void deleteUserById(long id);

}
