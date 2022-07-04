package com.zhwcloud.controller.service.impl;

import com.zhwcloud.controller.rpcinterfase.serviceservice.SkyWalkingServiceRPC;
import com.zhwcloud.controller.service.SkyWalkingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkyWalkingServiceImpl implements SkyWalkingService {

    private final Logger logger = LogManager.getLogger();

    @Autowired
    private SkyWalkingServiceRPC skyWalkingServiceRPC;

    @Override
    public String index() {
        String rStr = "cloud_controller";
        return skyWalkingServiceRPC.index(rStr);
    }

    @Override
    public void logTrace() {
        logger.info("SkyWalkingServiceImpl.logTrace()  执行到业务1");

        logger.info("SkyWalkingServiceImpl.logTrace()  执行到业务2");

        logger.info("SkyWalkingServiceImpl.logTrace()  执行到业务3");

        logger.info("SkyWalkingServiceImpl.logTrace()  执行到业务4");
    }
}
