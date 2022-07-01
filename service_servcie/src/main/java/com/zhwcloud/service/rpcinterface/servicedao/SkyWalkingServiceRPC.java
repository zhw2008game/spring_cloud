package com.zhwcloud.service.rpcinterface.servicedao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "cloud-service-dao")
public interface SkyWalkingServiceRPC {

    @RequestMapping(value = "skyWalking/index")
    String index(@RequestParam("path") String path);
}
