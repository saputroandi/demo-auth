package com.demo_auth.backend.dto;

import com.demo_auth.backend.validator.constraint.PasswordMatch;
import com.demo_auth.backend.validator.constraint.RoleType;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@PasswordMatch(passwordField = "password", passwordConfirmationField = "passwordConfirmation")
public class CreateUserRequestDto {

    @Email
    private String email;

    @NotNull
    @Size(min = 8, message = "password must be at least 8 characters")
    // @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "must contain at least one uppercase letter, one lowercase letter, and one digit.")
    private String password;

    @NotNull
    @Size(min = 8, message = "password must be at least 8 characters")
    private String passwordConfirmation;

    @RoleType
    private String role;

}
