package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public Iterable<User> users() {
		return userService.findAll();
	}
	
	@GetMapping(value = "/user/{id}")
	public User user(@PathVariable("id") long id) {
		return userService.findById(id);
	}
}