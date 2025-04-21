package com.demo_auth.backend.entities;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    
    private String email;

    private String password;

    @Column(name = "email_verified_at")
    private Instant emailVerifiedAt;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;
}
