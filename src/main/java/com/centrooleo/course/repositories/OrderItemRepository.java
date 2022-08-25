package com.centrooleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centrooleo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
