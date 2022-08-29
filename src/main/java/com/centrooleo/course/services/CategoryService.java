package com.centrooleo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centrooleo.course.entities.Category;
import com.centrooleo.course.repositories.CategoryRepository;
import com.centrooleo.course.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository catRepository;
	
	public List<Category> findAll(){
		List<Category> list = catRepository.findAll();
		return list;
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = catRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

}
