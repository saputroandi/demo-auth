package com.demo_auth.backend.validator.constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.demo_auth.backend.validator.PasswordMatchValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = PasswordMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PasswordMatch {
    
    String message() default "password do not match";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    String passwordField();
    String passwordConfirmationField();
}
