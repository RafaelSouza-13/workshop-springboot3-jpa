package com.inicio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicio.curso.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
