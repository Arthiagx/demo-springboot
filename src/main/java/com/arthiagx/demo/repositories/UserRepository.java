package com.arthiagx.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthiagx.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
