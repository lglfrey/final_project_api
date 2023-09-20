package com.example.postgresdemo.services;

import com.example.postgresdemo.model.Role;
import com.example.postgresdemo.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends GenericService<Role>{
    public RoleService(RoleRepository repository) {
        super(repository);
    }
}
