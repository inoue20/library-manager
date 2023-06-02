package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.repository.UserRepository;

public class UserService {
	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
