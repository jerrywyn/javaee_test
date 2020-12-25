package com.example.test_mybatis.dao;

import com.example.test_mybatis.entity.User;

import java.util.List;

public interface UserDao {
    //插入用户
    int insert(User user);
    //根据id查询
    User selectById(String id);
    //查询所有
    List<User> selectAll();
}