package com.example.postgresdemo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Table(name = "role")
public class Role extends AbstractEntity implements GrantedAuthority, Serializable, GenericEntity<Role> {
    @NotBlank(message = "Name is required")
    @Size(min = 1, max = 100, message = "Size must be between 1 and 100")
    @Column(name = "name")
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public void update(Role source) {
        this.name = source.name;
//        this.users = source.users;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public Role createNewInstance() {
        Role newInstance = new Role();
        newInstance.update(this);

        return newInstance;
    }
}
