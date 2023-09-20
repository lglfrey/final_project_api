package com.example.postgresdemo.services;

import com.example.postgresdemo.model.UserProject;
import com.example.postgresdemo.repository.GenericRepository;
import com.example.postgresdemo.repository.UserProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class UserProjectService extends GenericService<UserProject> {
    protected UserProjectService(UserProjectRepository repository) {
        super(repository);
    }
}
