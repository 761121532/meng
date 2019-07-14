package com.example.demo.Dao;

import com.example.demo.entity.realtime;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RealtimeMapper {

     realtime select(realtime name);//根据  name 这给字段查询数据

     boolean insertaa(realtime realtime);//向表里面插入数据insert

     boolean update(realtime realtime);//修改表字段的值

}
