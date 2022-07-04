package com.zhwcloud.controller.controller;

import com.zhwcloud.controller.service.SkyWalkingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SkyWalkingController {
    private Logger logger = LogManager.getLogger();

    @Autowired
    private SkyWalkingService skyWalkingService;

    @RequestMapping("skyWalking")
    public String skyWalkingIndex(){
        logger.info("skyWalking 接口被请求");
        return skyWalkingService.index();
    }

    @RequestMapping("logTrace")
    public String skyWalkingLogTrace(){
        ThreadContext.put("traceId", UUID.randomUUID().toString());

        logger.info("参数校验");


        logger.info("执行业务--1");


        logger.info("执行业务--2");


        logger.info("执行业务--3");

        skyWalkingService.logTrace();
        return "";
    }
}
