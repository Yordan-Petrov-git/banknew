package com.advance.academy.bank.system.domain.impl;

import com.advance.academy.bank.system.data.dao.RoleRepository;
import com.advance.academy.bank.system.data.model.Role;
import com.advance.academy.bank.system.data.model.models.RoleServiceModel;
import com.advance.academy.bank.system.domain.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository, ModelMapper modelMapper) {
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public void seedRolesInDatabase() {

        Role admin = new Role("ADMIN");
        Role user = new Role("USER");

        this.roleRepository.saveAndFlush(admin);
        this.roleRepository.saveAndFlush(user);

    }

    @Override
    public Set<RoleServiceModel> findAllRoles() {
        return this.roleRepository.findAll()
                .stream()
                .map(r -> this.modelMapper.map(r, RoleServiceModel.class))
                .collect(Collectors.toSet());
    }

    @Override
    public RoleServiceModel findByAuthority(String role) {

        return this.modelMapper.map(this.roleRepository.findByAuthority(role), RoleServiceModel.class);
    }


}
