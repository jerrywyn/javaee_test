package com.example.test_mybatis.controller;

import com.example.test_mybatis.service.UserService;
import com.example.test_mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable String userId){
        return userService.getByUserId(userId);
    }

    @GetMapping("/user")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/user/page/{pageNum}")
    public Object getPage(@PathVariable int pageNum,
        @RequestParam(name = "pageSize",required = false,defaultValue = "10") int pageSize){
        return userService.getAll(pageNum,pageSize);
    }

    @PostMapping("/user")
    public Object addOne(User user){
        userService.insert(user);
        return user;
    }
}