package com.zhwcloud.dao.controller;

import com.zhwcloud.dao.service.SkyWalkingService;
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
    @RequestMapping("dao")
    public String skyWalkingIndex(String path){
        return skyWalkingService.index(path);
    }
}
