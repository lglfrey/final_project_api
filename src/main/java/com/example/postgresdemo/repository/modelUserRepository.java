package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.modelUser;
import org.springframework.stereotype.Repository;

@Repository
public interface modelUserRepository extends GenericRepository<modelUser> {
    modelUser findByUsername(String username);
}