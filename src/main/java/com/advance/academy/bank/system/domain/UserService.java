package com.advance.academy.bank.system.domain;


import com.advance.academy.bank.system.data.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void createUser(User user);

    void updateUser(User user);

    User getUserById(long id);

    List<User> getAllUsers();

    void deleteUserById(long id);
}
