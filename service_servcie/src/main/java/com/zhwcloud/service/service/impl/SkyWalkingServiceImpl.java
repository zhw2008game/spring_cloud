package com.zhwcloud.service.service.impl;

import com.zhwcloud.service.service.SkyWalkingService;
import org.springframework.stereotype.Service;

@Service
public class SkyWalkingServiceImpl implements SkyWalkingService {

    @Override
    public String index(String path) {
        path = path == null ? "cloud_service" : path + "; " + "cloud_service";
        return path;
    }
}
