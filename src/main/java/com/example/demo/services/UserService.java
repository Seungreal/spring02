package com.example.demo.services;

import com.example.demo.domains.UserDTO;

import org.springframework.stereotype.Component;

@Component
public interface UserService {

	public int join(UserDTO u);

	public UserDTO login(UserDTO u);
    
}
