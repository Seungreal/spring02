package com.example.demo.imples;

import com.example.demo.domains.UserDTO;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired UserRepository userRepository;
    @Override
    public int join(UserDTO u) {
        return userRepository.insert(u);
    }

    @Override
    public UserDTO login(UserDTO u) {
        return userRepository.login(u);
    }

    @Override
    public UserDTO selectById(String userid) {
        return userRepository.selectById(userid);
    }

    @Override
    public int update(UserDTO u) {
        return userRepository.update(u);
    }

    @Override
    public int remove(UserDTO u) {
        return userRepository.delete(u);
    }
    
}
