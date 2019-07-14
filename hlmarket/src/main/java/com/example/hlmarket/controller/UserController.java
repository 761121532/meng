package com.example.hlmarket.controller;

import com.example.hlmarket.entity.LoginMsg;
import com.example.hlmarket.entity.User;
import com.example.hlmarket.server.UserServer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource(name = "UserServiceImpl")
    UserServer userServer;
    //登陆方法
    @RequestMapping(value = "/users/login",method = RequestMethod.POST)
    public LoginMsg login(User user){
        return userServer.login(user);
    }
    //添加用户
    @RequestMapping(value = "/users/add",method = RequestMethod.POST)
    public LoginMsg UserAdd(User user){
        return userServer.UserAdd(user);
    }


}
