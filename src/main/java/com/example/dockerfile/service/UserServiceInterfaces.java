package com.example.dockerfile.service;

import com.example.dockerfile.domain.UserinfoVo;
import org.springframework.stereotype.Service;

/*** @author wenxin
 @date 2022年08月16日 10:35
 @Describe:
 @version 1.0
 @motto 今天又是充满希望的一天
 */

public interface UserServiceInterfaces {

    /**
     * @return UserinfoVo
     * @description: 查询用户
     * * @param UserinfoVo: 用户信息
     * @author: Xin
     * @time: 2022/8/16 11:24
     */
    UserinfoVo getUserinfo(UserinfoVo userinfoVo);
}
