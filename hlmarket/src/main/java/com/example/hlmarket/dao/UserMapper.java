package com.example.hlmarket.dao;

import com.example.hlmarket.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User login(User user);

    public boolean UserAdd(User user);
}
