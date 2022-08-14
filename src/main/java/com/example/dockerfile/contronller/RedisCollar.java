package com.example.dockerfile.contronller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xin
 */
@RestController
public class RedisCollar {
    @Autowired
    private ReimplementedService  reimplementedService;


    @GetMapping("/redis")
    public Integer  redisCount(){
        Integer count = reimplementedService.getCount();
        return  count;
    }
}
