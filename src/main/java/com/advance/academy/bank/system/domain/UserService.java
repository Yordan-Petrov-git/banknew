package com.advance.academy.bank.system.domain;


import com.advance.academy.bank.system.data.model.User;
import com.advance.academy.bank.system.data.model.dto.UserSeedDto;
import com.advance.academy.bank.system.data.model.dto.UserViewDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void createUser(UserSeedDto user);

    void updateUser(UserSeedDto user);

    UserViewDto getUserById(long id);

    List<UserViewDto> getAllUsers();

    void deleteUserById(long id);
}
