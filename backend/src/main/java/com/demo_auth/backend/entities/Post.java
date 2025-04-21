package com.demo_auth.backend.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "posts")
public class Post extends BaseEntity {
    
    private String title;

    private String content;

    @Column(name = "published_at")
    private Instant publishedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
