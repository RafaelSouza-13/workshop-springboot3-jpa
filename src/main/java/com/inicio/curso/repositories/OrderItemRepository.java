package com.inicio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inicio.curso.entities.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> { 
    
}
