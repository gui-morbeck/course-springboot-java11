package com.centrooleo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centrooleo.course.entities.Payment;
import com.centrooleo.course.repositories.PaymentRepository;
import com.centrooleo.course.services.exceptions.ResourceNotFoundException;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repository;
	
	public List<Payment> findAll(){
		List<Payment> list = repository.findAll();
		return list;
	}
	
	public Payment findById(Long id) {
		Optional<Payment> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
}
