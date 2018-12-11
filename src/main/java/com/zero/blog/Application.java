package com.zero.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "{com.zero.blog.dao,com.zero.blog.service,com.zero.blog.controller}")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
