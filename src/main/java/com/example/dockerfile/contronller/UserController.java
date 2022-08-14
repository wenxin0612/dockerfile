package com.example.dockerfile.contronller;


import cn.dev33.satoken.stp.StpUtil;
import com.example.dockerfile.contronller.requestvo.LoginVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * @author xin
 */
@RestController
public class UserController {




    @GetMapping("/miss")
    public String sayHello(String s) throws ParseException {

        String username="zhang";String password="123456";

        if("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return "登录成功";
        }


         return "啊aa";
    }

   @PostMapping("/doLogin")
    public String doLogin(@RequestBody LoginVO vo){
       // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
       if("zhang".equals(vo.getUsername()) && "123456".equals(vo.getPassword())) {
           StpUtil.login(10001);
           return "登录成功";
       }
       return "登录失败";
   }



}
