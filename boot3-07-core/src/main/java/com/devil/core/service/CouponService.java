package com.devil.core.service;

import com.devil.core.entity.UserEntity;
import com.devil.core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * ClassName：CouponService
 *
 * @author: Devil
 * @Date: 2024/12/10
 * @Description:
 * @version: 1.0
 */
@Service
public class CouponService {

    @EventListener
    public void onEvent(LoginSuccessEvent loginSuccessEvent){
        System.out.println("====CouponService 收到事件 ====");
        UserEntity source =(UserEntity) loginSuccessEvent.getSource();
        sendCoupon(source.getUsername());
    }
    public void sendCoupon(String username){
        System.out.println(username + "得到了一张优惠卷");
    }
}
