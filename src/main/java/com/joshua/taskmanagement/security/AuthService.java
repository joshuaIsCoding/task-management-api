package com.joshua.taskmanagement.security;

import com.joshua.taskmanagement.dto.RegisterRequest;
import com.joshua.taskmanagement.dto.RegisterResponse;
import com.joshua.taskmanagement.repo.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.joshua.taskmanagement.model.User;
@Service
public class AuthService {

    private UserRepository repository;
    private PasswordEncoder passwordEncoder;

    public AuthService(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public RegisterResponse registerResponse(RegisterRequest request) {
        if(repository.existsByEmail(request.email())) {
            throw new IllegalArgumentException("This email is already in use");
        }

        User user = new User();
        user.setEmail(request.email());
        user.setPassword(passwordEncoder.encode(request.password()));

        User saved = repository.save(user);
        return new RegisterResponse(saved);
    }
}
