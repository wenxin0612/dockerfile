package com.example.dockerfile.contronller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author xin
 */
@Service
public class ReimplementedService {


    @Qualifier("redisTemplate")
    @Autowired
    private RedisTemplate redis;

    public Integer getCount() {
        Boolean add = redis.opsForZSet().add("austin", "zlw", 90);
        System.out.println(add);

        return null;

    }


}
