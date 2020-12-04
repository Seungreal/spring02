package com.example.demo.repositories;

import com.example.demo.domains.UserDTO;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

	public int insert(UserDTO u);

	public UserDTO login(UserDTO u);

	public UserDTO selectById(String userid);

	public int update(UserDTO u);

	public int delete(UserDTO u);
    
}
