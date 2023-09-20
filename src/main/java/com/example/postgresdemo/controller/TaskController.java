package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.Task;
import com.example.postgresdemo.repository.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/tasks")
public class TaskController extends GenericController<Task>{
    public TaskController(GenericRepository<Task> repository) {
        super(repository);
    }
}
