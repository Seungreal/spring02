package com.example.demo.controlleres;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.UserDTO;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    @Autowired UserService userService;
    @PostMapping("/users")
    public Map<String,String> join(@RequestBody UserDTO u){
        Map<String,String> map = new HashMap<String,String>();
        System.out.println("아이디:"+u.getUserid());
        System.out.println("비밀번호:"+u.getPassword());
        System.out.println("이름:"+u.getName());
        int result=userService.join(u);
        if(result==1)
        map.put("name", u.getName());
        else
        map.put("name","FAILURE");
        return map;
    }
}