package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Iterable<User> findAll() {
		Iterable<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public User findById(long id) {
		User user = userRepository.findById(id);
		return user;
	}
}
