package com.example.postgresdemo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "user_projects")
public class UserProject extends AbstractEntity implements Serializable, GenericEntity<UserProject> {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private modelUser user;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @Override
    public void update(UserProject source) {
        this.user = source.user;
        this.project = source.project;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public UserProject createNewInstance() {
        UserProject userProject = new UserProject();
        userProject.update(this);
        return userProject;
    }
}
