package com.centrooleo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centrooleo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
