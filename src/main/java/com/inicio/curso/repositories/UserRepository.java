package com.inicio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicio.curso.model.User;

public interface UserRepository extends JpaRepository<User, Long> { 
    
}
