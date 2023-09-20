package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.modelUser;
import com.example.postgresdemo.repository.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/users")
public class UsersController extends GenericController<modelUser>{
    public UsersController(GenericRepository<modelUser> repository) {
        super(repository);
    }
}
