package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

  Iterable<User> findByLastName(String lastName);

  User findById(long id);
}
