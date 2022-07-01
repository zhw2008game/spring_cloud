package com.zhwcloud.service.service.impl;

import com.zhwcloud.service.rpcinterface.servicedao.SkyWalkingServiceRPC;
import com.zhwcloud.service.service.SkyWalkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkyWalkingServiceImpl implements SkyWalkingService {

    @Autowired
    private SkyWalkingServiceRPC skyWalkingServiceRPC;

    @Override
    public String index(String path) {
        path = path == null ? "cloud_service" : path + "; " + "cloud_service";
        return skyWalkingServiceRPC.index(path);
    }
}
