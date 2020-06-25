package com.advance.academy.bank.system.domain.services;

import com.advance.academy.bank.system.data.models.RoleServiceModel;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RoleService {

    void seedRolesInDatabase();

    Set<RoleServiceModel> findAllRoles();

    RoleServiceModel findByAuthority(String role);

}
