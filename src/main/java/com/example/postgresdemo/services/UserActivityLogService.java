package com.example.postgresdemo.services;

import com.example.postgresdemo.model.UserActivityLog;
import com.example.postgresdemo.repository.GenericRepository;
import com.example.postgresdemo.repository.UserActivityLogRepository;
import org.springframework.stereotype.Service;

@Service
public class UserActivityLogService extends GenericService<UserActivityLog>{
    protected UserActivityLogService(UserActivityLogRepository repository) {
        super(repository);
    }
}
