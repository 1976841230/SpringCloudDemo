package com.kuranado.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Xinling Jing
 * @Date: 2018/11/13 0013 18:47
 */
@FeignClient("compute-service")
public interface ComputeClientService {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);

}
