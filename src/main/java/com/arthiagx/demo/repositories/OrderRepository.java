package com.arthiagx.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthiagx.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
