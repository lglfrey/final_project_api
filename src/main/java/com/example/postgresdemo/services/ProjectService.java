package com.example.postgresdemo.services;

import com.example.postgresdemo.model.Project;
import com.example.postgresdemo.repository.GenericRepository;
import com.example.postgresdemo.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends GenericService<Project>{
    protected ProjectService(ProjectRepository repository) {
        super(repository);
    }
}
