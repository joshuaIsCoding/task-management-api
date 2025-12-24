package com.joshua.taskmanagement.dto;
import com.joshua.taskmanagement.model.User;
public record RegisterResponse(Long id,String email,String role) {

    public RegisterResponse(User user) {
        this(user.getId(), user.getEmail(), user.getRole());
    }
}
