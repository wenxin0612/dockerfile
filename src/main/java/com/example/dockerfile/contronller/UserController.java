package com.example.dockerfile.contronller;


import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import cn.hutool.core.bean.BeanUtil;
import com.example.dockerfile.domain.UserinfoVo;
import com.example.dockerfile.requestvo.LoginVO;
import com.example.dockerfile.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xin
 */
@RestController
public class UserController {

    @Autowired
    UsersServiceImpl userService;

    @PostMapping("/doLogin")
    public String doLogin(@RequestBody LoginVO vo) {

        UserinfoVo userinfoVo = BeanUtil.copyProperties(vo, UserinfoVo.class);
        UserinfoVo userinfo = userService.getUserinfo(userinfoVo);
        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
        if (userinfo.getUsername().equals(vo.getUserAccount()) && userinfo.getPasswd().equals(vo.getPasswd())) {
            StpUtil.login(userinfo.getUserId());
            return "登录成功";
        }
        return "登录失败";
    }

    @GetMapping("/isLogin")
    public SaResult  isLogin() {
        return SaResult.ok("是否登录：" + StpUtil.isLogin());
    }


    @GetMapping("tokenInfo")
    public SaResult tokenInfo() {
        return SaResult.data(StpUtil.getTokenInfo());
    }



}
