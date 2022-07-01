package com.zhwcloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class serviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(serviceApplication.class, args);
    }
}
