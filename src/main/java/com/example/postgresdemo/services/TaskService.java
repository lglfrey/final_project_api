package com.example.postgresdemo.services;
import com.example.postgresdemo.model.Task;
import com.example.postgresdemo.repository.GenericRepository;
import com.example.postgresdemo.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService extends GenericService<Task>{

    protected TaskService(TaskRepository repository) {
        super(repository);
    }
}
