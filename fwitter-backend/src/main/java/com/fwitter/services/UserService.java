package com.fwitter.services;

import com.fwitter.models.ApplicationUser;
import com.fwitter.repositories.RoleRepository;
import com.fwitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepo;
    private final RoleRepository roleRepository;

    @Autowired
    public UserService(UserRepository userRepo, RoleRepository roleRepository) {
        this.userRepo = userRepo;
        this.roleRepository = roleRepository;
    }
    public ApplicationUser registerUser(ApplicationUser user){
        return user;
    }
}
