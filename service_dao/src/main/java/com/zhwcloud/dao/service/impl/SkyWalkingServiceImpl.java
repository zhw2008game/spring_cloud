package com.zhwcloud.dao.service.impl;

import com.zhwcloud.dao.service.SkyWalkingService;
import org.springframework.stereotype.Service;

@Service
public class SkyWalkingServiceImpl implements SkyWalkingService {

    @Override
    public String index(String path) {
        path = path == null ? "cloud_dao" : path + "; " + "cloud_dao";
        return path;
    }
}
