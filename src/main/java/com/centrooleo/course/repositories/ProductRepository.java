package com.centrooleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centrooleo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
