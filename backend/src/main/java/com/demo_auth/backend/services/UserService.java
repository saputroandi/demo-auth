package com.demo_auth.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.demo_auth.backend.dto.UserResponseDto;
import com.demo_auth.backend.entities.User;
import com.demo_auth.backend.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public UserResponseDto getUser(Long id){

        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("user tidak di temukan"));

        return UserResponseDto.builder().email(user.getEmail()).password(user.getPassword()).role(user.getRole()).build();
    }
}
