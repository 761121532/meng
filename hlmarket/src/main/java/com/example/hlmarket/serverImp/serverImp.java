package com.example.hlmarket.serverImp;

import com.example.hlmarket.dao.UserMapper;
import com.example.hlmarket.entity.LoginMsg;
import com.example.hlmarket.entity.User;
import com.example.hlmarket.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserServiceImpl")
public class serverImp implements UserServer {

    @Autowired
    UserMapper userMapper;
    @Override
    public LoginMsg login(User user) {
        User finduser=userMapper.login(user);
        if (user.getUsername().equals(finduser.getUsername())&&user.getPassword().equals(finduser.getPassword())){
            LoginMsg loginMsg=new LoginMsg();
            loginMsg.setErrcode(1);
            loginMsg.setMsg("在下萝莉控");
            return loginMsg;
        }
        LoginMsg loginMsg=new LoginMsg();
        loginMsg.setErrcode(0);
        loginMsg.setMsg("有毛病");
        return loginMsg;
    }

    @Override
    public LoginMsg UserAdd(User user) {
        System.out.println(user);
        if (userMapper.UserAdd(user)){
            LoginMsg loginMsg=new LoginMsg();
            loginMsg.setErrcode(1);
            loginMsg.setMsg("在下萝莉控");
            return loginMsg;
        }
        LoginMsg loginMsg=new LoginMsg();
        loginMsg.setErrcode(0);
        loginMsg.setMsg("有毛病");
        return loginMsg;
    }


}
