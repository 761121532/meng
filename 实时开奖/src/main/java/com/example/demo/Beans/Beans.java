package com.example.demo.Beans;

import com.example.demo.Method.MethodForData;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.io.IOException;

@Configuration
public class Beans {
    @Bean
    MethodForData userService() throws IOException {
        Connection.Response res = Jsoup.connect("https://www.20091997.com/eapi/get_lottery_data?token=12ogUvjQvNQ11OCO9rRE&offset=1&gameMark=wflhc")
                .header("Accept", "*/*")
                .header("Accept-Encoding", "gzip, deflate")
                .header("Accept-Language","zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
                .header("Content-Type", "application/json;charset=UTF-8")
                .header("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
                .timeout(10000).ignoreContentType(true).execute();//.get();
        String body = res.body();
        return new MethodForData(body);
    }
}
