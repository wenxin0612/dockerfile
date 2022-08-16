package com.example.dockerfile.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/*** @author wenxin
 @date 2022年08月16日 11:20
 @Describe:
 @version 1.0
 @motto 今天又是充满希望的一天
 */
@Data
public class UserinfoVo {

    Long userId;

    String username;

    String isFlag;


    String phone;


    Integer role;

    String userAccount;
    String passwd;

}
