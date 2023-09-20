package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.TaskComment;
import com.example.postgresdemo.repository.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/task_comments")
public class TaskCommentController extends GenericController<TaskComment>{
    public TaskCommentController(GenericRepository<TaskComment> repository) {
        super(repository);
    }
}
