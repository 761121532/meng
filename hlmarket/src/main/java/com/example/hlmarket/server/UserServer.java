package com.example.hlmarket.server;

import com.example.hlmarket.entity.LoginMsg;
import com.example.hlmarket.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface UserServer {
    public LoginMsg login(User user);

    public LoginMsg UserAdd(User user);
}
