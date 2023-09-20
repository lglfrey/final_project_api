package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.modelUser;
import com.example.postgresdemo.repository.RoleRepository;
import com.example.postgresdemo.repository.modelUserRepository;
import com.example.postgresdemo.model.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public/registration")
public class RegistrationController {
    @Autowired
    private modelUserRepository modelUserRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping()
    private ResponseEntity<String> reg(@RequestBody RegistrationRequest registrationBody){
        modelUser userFromDB = modelUserRepository.findByUsername(registrationBody.getUsername());
        if (userFromDB != null){
            return ResponseEntity.badRequest().body("test - Пользователь с таким логином уже существует");
        }

        modelUser user = new modelUser();
        user.setActive(true);
        user.setRole(roleRepository.findByName("USER"));
        user.setUsername(registrationBody.getUsername());
        user.setPassword(passwordEncoder.encode(registrationBody.getPassword()));
        modelUserRepository.save(user);
        return ResponseEntity.ok("success");
    }
}
