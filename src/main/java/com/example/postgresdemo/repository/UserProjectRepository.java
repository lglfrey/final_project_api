package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.GenericEntity;
import com.example.postgresdemo.model.UserProject;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProjectRepository extends GenericRepository<UserProject> {
}
