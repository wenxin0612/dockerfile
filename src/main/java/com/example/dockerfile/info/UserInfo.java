package com.example.dockerfile.info;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/*** @author wenxin
 @date 2022年08月16日 11:13
 @Describe:
 @version 1.0
 @motto 今天又是充满希望的一天
 */
@Data
@TableName("user_info")
public class UserInfo {

    @TableField("user_id")
    Long userId;

    @TableField("user_name")
    String username;

    @TableField("is_flag")
    String isFlag;


    @TableField("phone")
    String phone;


    @TableField("role")
    Integer role;

    @TableField("user_account")
    String UserAccount;

    @TableField("passwd")
    String passwd;

}
