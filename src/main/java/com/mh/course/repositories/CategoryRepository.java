package com.mh.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mh.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
