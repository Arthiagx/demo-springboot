package com.arthiagx.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthiagx.demo.entities.User;
import com.arthiagx.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}	
	public User findbyId(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
