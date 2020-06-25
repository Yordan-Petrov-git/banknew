package com.advance.academy.bank.system.domain;

import com.advance.academy.bank.system.data.model.models.RoleServiceModel;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RoleService {

    void seedRolesInDatabase();

    Set<RoleServiceModel> findAllRoles();

    RoleServiceModel findByAuthority(String role);

}
