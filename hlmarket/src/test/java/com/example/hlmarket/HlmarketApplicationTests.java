package com.example.hlmarket;

import com.example.hlmarket.dao.UserMapper;
import com.example.hlmarket.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HlmarketApplicationTests {
    /**
     *
     */
    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        User user=new User();
        user.setUsername("在下萝莉控");
        user.setPassword("mengmeng");
        user.setRealname("李狗蛋");
        user.setUsergroup("root");
        System.out.println(userMapper.UserAdd(user));
    }

}
