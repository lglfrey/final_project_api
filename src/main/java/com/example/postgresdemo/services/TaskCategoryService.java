package com.example.postgresdemo.services;

import com.example.postgresdemo.model.TaskCategory;
import com.example.postgresdemo.repository.GenericRepository;
import com.example.postgresdemo.repository.TaskCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskCategoryService extends GenericService<TaskCategory> {
    protected TaskCategoryService(TaskCategoryRepository repository) {
        super(repository);
    }
}
