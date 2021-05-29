package com.mh.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mh.course.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
