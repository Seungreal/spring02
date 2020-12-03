package com.example.demo.repositories;

import com.example.demo.domains.UserDTO;

import org.springframework.stereotype.Component;

@Component
public interface UserRepository {

	public int insert(UserDTO u);

	public UserDTO login(UserDTO u);
    
}
