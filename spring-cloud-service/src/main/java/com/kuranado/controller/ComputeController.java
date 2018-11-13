package com.kuranado.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Xinling Jing
 * @Date: 2018/11/13 0013 17:29
 */
@RestController
public class ComputeController {

    private Logger logger = LoggerFactory.getLogger(ComputeController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer compute(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        Integer result = a + b;
        logger.info("Host:{}, Port:{}, ServiceId:{}, Uri:{}, Result:{}", instance.getHost(), instance.getPort(), instance.getServiceId(), instance.getUri(), result);
        return result;
    }

}
