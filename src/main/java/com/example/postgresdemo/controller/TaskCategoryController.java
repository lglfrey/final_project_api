package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.TaskCategory;
import com.example.postgresdemo.repository.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/task_categories")
public class TaskCategoryController extends GenericController<TaskCategory>{
    public TaskCategoryController(GenericRepository<TaskCategory> repository) {
        super(repository);
    }
}
