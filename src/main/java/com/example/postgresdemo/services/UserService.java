package com.example.postgresdemo.services;

import com.example.postgresdemo.model.modelUser;
import com.example.postgresdemo.repository.modelUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<modelUser>{
    public UserService(modelUserRepository repository) {
        super(repository);
    }
}
