package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.UserActivityLog;
import com.example.postgresdemo.repository.GenericRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/user_activity_logs")
public class UserActivityLogController extends GenericController<UserActivityLog>{
    public UserActivityLogController(GenericRepository<UserActivityLog> repository) {
        super(repository);
    }
}
