package com.example.demo.controller;


import com.example.demo.Serverimpl.action;
import com.example.demo.entity.realtime;
import com.example.demo.server.realTimeServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

@RestController
public class controller {
    @Autowired
    realTimeServer realTimeServer;
    @Autowired
    action ction;

        @RequestMapping(value = "update",method = RequestMethod.GET)
        public  void action() {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    try {
                        ction.action();
                        System.out.println("循环了一次");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }, 100, 30000);
        }

        @RequestMapping(value = "insert",method = RequestMethod.GET)
        public  boolean sinsertDataOfFont(realtime realtime){
            return realTimeServer.InsertInTo(realtime);
        }

    @RequestMapping(value = "select",method = RequestMethod.GET)
    public realtime aaa(realtime realtime){
        realtime.setName(190706);
        return realTimeServer.SecectFromName(realtime);
    }

    /**
     * 修改数据库  每一次的值
     * @param realtime 前端传过来 的值
     * @return  返回给前端渲染
     */
    @RequestMapping(value = "updataDatabase",method = RequestMethod.GET)
    public realtime updateDatabase(realtime realtime){
        if (realTimeServer.SecectFromName(realtime)==null){
            realTimeServer.InsertInTo(realtime);
            return realTimeServer.SecectFromName(realtime);
        }else {
            realTimeServer.update(realtime);
            return realTimeServer.SecectFromName(realtime);
        }

    }



}
