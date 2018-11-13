package com.kuranado.controller;

import com.kuranado.service.ComputeClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Xinling Jing
 * @Date: 2018/11/13 0013 18:45
 */
@RestController
public class FeignConsumeController {

    @Autowired
    ComputeClientService computeClientService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClientService.add(1, 2);
    }

}
