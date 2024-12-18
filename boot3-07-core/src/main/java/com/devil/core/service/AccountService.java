package com.devil.core.service;

import com.devil.core.entity.UserEntity;
import com.devil.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * ClassName：AccountService
 *
 * @author: Devil
 * @Date: 2024/12/10
 * @Description:
 * @version: 1.0
 */
@Service
public class AccountService implements ApplicationListener<LoginSuccessEvent> {
    public void addAccountScore(String username){
        System.out.println(username + "加了1分");
    }

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("====AccountService 收到事件 ====");
        UserEntity source =(UserEntity) event.getSource();
        addAccountScore(source.getUsername());
    }
}
