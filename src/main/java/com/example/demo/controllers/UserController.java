package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.UserDTO;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired UserService userService;
    @PostMapping("/users")
    public Map<String,String> join(@RequestBody UserDTO u){
        Map<String,String> map = new HashMap<String,String>();
        int result = userService.join(u);
        if(result==1){
            map.put("name", u.getName());
        }else{
            map.put("name","FAILURE");
        }
        return map;
    }
    @PostMapping("users/login")
    public Map<String,String> login(@RequestBody UserDTO u){
        Map<String,String> map = new HashMap<String,String>();
        UserDTO result = userService.login(u);
        if(result!=null){
            map.put("name", result.getName());
        }else{
            map.put("name", "FAILURE");
        }
        return map;
    }
}
