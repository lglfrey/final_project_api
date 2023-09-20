package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.Project;
import com.example.postgresdemo.model.UserProject;
import com.example.postgresdemo.repository.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/public/user_projects")
public class UserProjectController extends GenericController<UserProject>{
    public UserProjectController(GenericRepository<UserProject> repository) {
        super(repository);
    }
}
