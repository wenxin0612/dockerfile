package com.example.dockerfile.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.example.dockerfile.db.UserDb;
import com.example.dockerfile.domain.UserinfoVo;
import com.example.dockerfile.info.Student;
import com.example.dockerfile.info.UserInfo;
import com.example.dockerfile.service.UserServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/*** @author wenxin
 @date 2022年08月16日 10:34
 @Describe:
 @version 1.0
 @motto 今天又是充满希望的一天
 */
@Component
public class UsersServiceImpl implements UserServiceInterfaces {
    @Autowired
    UserDb userDb;

    @Override
    public UserinfoVo getUserinfo(UserinfoVo userinfoVo) {
        QueryWrapper<UserInfo> userInfoQueryChainWrapper = new QueryWrapper<>();
        userInfoQueryChainWrapper.lambda().eq(UserInfo::getUserAccount, userinfoVo.getUserAccount())
                .eq(UserInfo::getPasswd, userinfoVo.getPasswd());
        UserInfo userInfos = userDb.selectOne(userInfoQueryChainWrapper);
        UserinfoVo userinfoVos = BeanUtil.copyProperties(userInfos, UserinfoVo.class);
        return userinfoVos;
    }
}
