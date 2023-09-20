package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.TaskAttachment;
import com.example.postgresdemo.repository.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/task_attachments")
public class TaskAttachmentController extends GenericController<TaskAttachment> {
    public TaskAttachmentController(GenericRepository<TaskAttachment> repository) {
        super(repository);
    }
}
