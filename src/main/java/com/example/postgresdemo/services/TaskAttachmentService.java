package com.example.postgresdemo.services;

import com.example.postgresdemo.model.TaskAttachment;
import com.example.postgresdemo.repository.GenericRepository;
import com.example.postgresdemo.repository.TaskAttachmentRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskAttachmentService extends GenericService<TaskAttachment>{
    protected TaskAttachmentService(TaskAttachmentRepository repository) {
        super(repository);
    }
}
