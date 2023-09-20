package com.example.postgresdemo.services;

import com.example.postgresdemo.model.TaskComment;
import com.example.postgresdemo.repository.GenericRepository;
import com.example.postgresdemo.repository.TaskCommentRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskCommentService extends GenericService<TaskComment> {
    protected TaskCommentService(TaskCommentRepository repository) {
        super(repository);
    }
}
