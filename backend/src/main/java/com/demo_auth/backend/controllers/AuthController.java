package com.demo_auth.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_auth.backend.dto.CreateUserRequestDto;
import com.demo_auth.backend.services.AuthService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;
    
    @PostMapping("/register")
    public Long register(@Validated @RequestBody CreateUserRequestDto request){
        log.info("Register Request: {}", request);
        return authService.register(request);
    }
}
