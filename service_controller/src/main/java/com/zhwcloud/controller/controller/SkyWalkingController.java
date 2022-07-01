package com.zhwcloud.controller.controller;

import com.zhwcloud.controller.service.SkyWalkingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
