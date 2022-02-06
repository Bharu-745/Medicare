package com.bharathy.medicare.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharathy.medicare.models.data.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByUsername(String username);    
}
