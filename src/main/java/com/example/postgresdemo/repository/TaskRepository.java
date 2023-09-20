package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends GenericRepository<Task>{
}
