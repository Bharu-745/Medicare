package com.bharathy.medicare.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharathy.medicare.models.data.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
