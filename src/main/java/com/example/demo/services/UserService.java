package com.example.demo.services;

import com.example.demo.entities.User;

public interface UserService {
	
	Iterable<User> findAll();
	
	User findById(long id);

}
