package com.zhwcloud.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class daoApplication {
    public static void main(String[] args) {
        SpringApplication.run(daoApplication.class, args);
    }
}
