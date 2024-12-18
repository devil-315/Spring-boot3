package com.devil.core.controller;

import com.devil.core.entity.UserEntity;
import com.devil.core.event.EventPublisher;
import com.devil.core.event.LoginSuccessEvent;
import com.devil.core.service.AccountService;
import com.devil.core.service.CouponService;
import com.devil.core.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：LoginController
 *
 * @author: Devil
 * @Date: 2024/12/10
 * @Description:
 * @version: 1.0
 */
@RestController
public class LoginController {

    @Autowired
    AccountService accountService;

    @Autowired
    CouponService couponService;

    @Autowired
    SysService sysService;

    @Autowired
    EventPublisher eventPublisher;

    @GetMapping("/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String passwd){
        //业务处理登录
        System.out.println("业务处理登录完成");

        //TODO 发生事件
        //1.创建事件信息
        LoginSuccessEvent event = new LoginSuccessEvent(new UserEntity(username, passwd));
        //2.发送事件
        eventPublisher.sendEvent(event);


        //1、账户服务自动签到加积分
//        accountService.addAccountScore(username);
//        //2、优惠服务随机发放优惠券
//        couponService.sendCoupon(username);
//        //3、系统服务登记用户登录的信息
//        sysService.recordLog(username);

        return username+"登录成功";
    }
}
