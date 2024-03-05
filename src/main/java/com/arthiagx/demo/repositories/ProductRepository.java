package com.arthiagx.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthiagx.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
