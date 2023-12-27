package com.inicio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicio.curso.entities.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> { 
    
}
