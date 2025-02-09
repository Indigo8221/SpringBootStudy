package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.pojo.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:  张三
 * date: 2025/2/9
 * desc:
 * version:
 */
@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/findById")
    public User findById(Integer id){
        return userService.findById(id);
    }
}
