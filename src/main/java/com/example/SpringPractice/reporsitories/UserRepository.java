package com.example.SpringPractice.reporsitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringPractice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
