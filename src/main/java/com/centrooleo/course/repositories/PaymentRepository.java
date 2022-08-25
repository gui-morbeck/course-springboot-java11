package com.centrooleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centrooleo.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{
}
