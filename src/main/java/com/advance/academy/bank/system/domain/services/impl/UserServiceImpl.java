package com.advance.academy.bank.system.domain.services.impl;

import com.advance.academy.bank.system.data.entities.Role;
import com.advance.academy.bank.system.data.entities.User;
import com.advance.academy.bank.system.data.dao.UserRepository;
import com.advance.academy.bank.system.data.models.UserSeedDto;
import com.advance.academy.bank.system.data.models.UserViewDto;
import com.advance.academy.bank.system.domain.services.RoleService;
import com.advance.academy.bank.system.domain.services.UserService;
import com.advance.academy.bank.system.exeption.InvalidEntityException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RoleService roleService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, RoleService roleService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.roleService = roleService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserSeedDto createUser(@Valid UserSeedDto userSeedDto) {
        //TODO


        User user = this.modelMapper.map(userSeedDto, User.class);

        this.userRepository.findByUsername(user.getUsername()).ifPresent(u -> {
            throw new InvalidEntityException(String.format("User with username '%s' already exists.", user.getUsername()));
        });

        if (userRepository.count() == 0) {
            this.roleService.seedRolesInDatabase();

            user.setAuthorities(this.roleService.findAllRoles()
                    .stream()
                    .map(r -> this.modelMapper.map(r, Role.class))
                    .collect(Collectors.toSet()));

        }else{
          user.setAuthorities(new LinkedHashSet<>());
          user.getAuthorities()
                  .add(this.modelMapper.map(this.roleService.findByAuthority("ÜSER"),Role.class));
        }

        user.setPassword(this.bCryptPasswordEncoder.encode(userSeedDto.getPassword()));

        user.setEnabled(true);
        user.setCredentialsNonExpired(true);
        user.setAccountNonLocked(true);
        user.setAccountNonExpired(true);

        return this.modelMapper.map( this.userRepository.saveAndFlush(user),UserSeedDto.class);
    }

    @Override
    @Transactional
    public void updateUser(@Valid UserSeedDto userSeedDto) {
        //TODO ADD UPDATE
        User user = this.modelMapper.map(userSeedDto, User.class);

        this.userRepository.saveAndFlush(user);

        // return userSeedDto;
    }

    @Override
    public UserViewDto getUserById(long id) {
        return this.modelMapper
                .map(this.userRepository.findById(id).orElseThrow(() ->
                        new EntityNotFoundException(String.format("User with ID %s not found.", id))), UserViewDto.class);
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepository.findByUsername(username).orElse(null);
    }
}
