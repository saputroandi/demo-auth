package com.demo_auth.backend.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo_auth.backend.dto.CreateUserRequestDto;
import com.demo_auth.backend.entities.Role;
import com.demo_auth.backend.entities.User;
import com.demo_auth.backend.repositories.UserRepository;

@Service
public class AuthService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    public Long register(CreateUserRequestDto requestDto){
        
        String encodedPassword = passwordEncoder.encode(requestDto.getPassword());

        User user = User.builder().email(requestDto.getEmail()).password(encodedPassword).emailVerifiedAt(Instant.now()).role(Role.valueOf(requestDto.getRole())).build();

        User savedUser = userRepository.save(user);

        return savedUser.getId();

    }
}
