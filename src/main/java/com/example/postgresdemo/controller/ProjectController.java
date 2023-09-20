package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.Project;
import com.example.postgresdemo.repository.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/projects")
public class ProjectController extends GenericController<Project> {
    public ProjectController(GenericRepository<Project> repository) {
        super(repository);
    }
}
