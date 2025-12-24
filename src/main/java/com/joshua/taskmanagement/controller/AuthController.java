package com.joshua.taskmanagement.controller;

import com.joshua.taskmanagement.dto.RegisterRequest;
import com.joshua.taskmanagement.dto.RegisterResponse;
import com.joshua.taskmanagement.security.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
   private AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

   @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest request) {
        RegisterResponse registerResponse = service.registerResponse(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(registerResponse);
   }
}
