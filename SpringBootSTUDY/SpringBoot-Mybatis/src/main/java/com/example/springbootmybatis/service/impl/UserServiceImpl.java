package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.pojo.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:  张三
 * date: 2025/2/9
 * desc:
 * version:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper username;

    @Override
    public User findById(Integer id) {
        return username.findById(id);
    }
}
