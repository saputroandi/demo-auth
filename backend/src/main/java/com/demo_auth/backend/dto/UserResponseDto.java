package com.demo_auth.backend.dto;

import com.demo_auth.backend.entities.Role;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDto {
    
    private String email;
    private String password;
    private Role role;
}
