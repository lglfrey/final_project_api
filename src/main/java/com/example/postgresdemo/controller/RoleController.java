package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.Role;
import com.example.postgresdemo.repository.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/roles")
public class RoleController extends GenericController<Role>{

    public RoleController(GenericRepository<Role> repository) {
        super(repository);
    }
}
