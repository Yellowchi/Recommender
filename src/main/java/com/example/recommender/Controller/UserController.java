package com.example.recommender.Controller;

import com.example.recommender.Bean.User;
import com.example.recommender.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/getuserinfo")
    public User getuserinfo(@RequestParam(name = "userid") String userid){
        return userMapper.selectById(userid);
    }
}
