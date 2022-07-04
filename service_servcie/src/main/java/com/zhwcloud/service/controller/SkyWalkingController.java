package com.zhwcloud.service.controller;

import com.zhwcloud.service.service.SkyWalkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("skyWalking")
public class SkyWalkingController {
    @Autowired
    private SkyWalkingService skyWalkingService;

    /**
     * Explain: skyWalking index接口
     */
    @RequestMapping("service")
    public String skyWalkingIndex(String path){
        return skyWalkingService.index(path);
    }
}
