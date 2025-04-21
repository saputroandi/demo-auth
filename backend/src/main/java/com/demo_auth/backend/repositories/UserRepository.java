package com.demo_auth.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo_auth.backend.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
