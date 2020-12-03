package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.UserDTO;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired UserService userService;
    @PostMapping("/users")
    public Map<?,?> join(@RequestBody UserDTO u){
        var map = new HashMap<>();
        int result = userService.join(u);
        if(result==1){
            map.put("message", "SUCESS");
        }
        return map;
    }
    @PostMapping("users/login")
    public Map<?,?> login(@RequestBody UserDTO u){
        var map = new HashMap<>();
        UserDTO result = userService.login(u);
        if(result!=null){
            map.put("message", "SUCCESS");
            map.put("loginUser", result);
        }else{
            map.put("message","FAILURE");
            map.put("loginUser", null);
        }
        return map;
    }
    @GetMapping("/users/{userid}")
    public Map<?,?> mypage(@PathVariable String userid){
        var map = new HashMap<>();
        System.out.println("넘어온 아이디: "+userid);
        map.put("message", "SUCESS");
        return map;
    }
}
