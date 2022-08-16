package com.example.dockerfile.db;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dockerfile.info.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/*** @author wenxin
 @date 2022年08月16日 10:41
 @Describe:
 @version 1.0
 @motto 今天又是充满希望的一天
 */
@Mapper
public interface  UserDb  extends BaseMapper<UserInfo> {
}
