package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends GenericRepository<Role>{
    Role findByName(String name);
}
