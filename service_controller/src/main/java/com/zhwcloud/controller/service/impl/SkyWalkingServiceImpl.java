package com.zhwcloud.controller.service.impl;

import com.zhwcloud.controller.rpcinterfase.serviceservice.SkyWalkingServiceRPC;
import com.zhwcloud.controller.service.SkyWalkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkyWalkingServiceImpl implements SkyWalkingService {

    @Autowired
    private SkyWalkingServiceRPC skyWalkingServiceRPC;

    @Override
    public String index() {
        String rStr = "cloud_controller";
        return skyWalkingServiceRPC.index(rStr);
    }
}
