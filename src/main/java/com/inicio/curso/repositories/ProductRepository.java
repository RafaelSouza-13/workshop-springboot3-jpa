package com.inicio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicio.curso.entities.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { 
    
}
