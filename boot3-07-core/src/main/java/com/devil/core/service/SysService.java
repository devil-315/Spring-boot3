package com.devil.core.service;

import com.devil.core.entity.UserEntity;
import com.devil.core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * ClassName：SysService
 *
 * @author: Devil
 * @Date: 2024/12/10
 * @Description:
 * @version: 1.0
 */
@Service
public class SysService {

    @EventListener
    public void haha(LoginSuccessEvent loginSuccessEvent){
        System.out.println("===SysService 感知到事件===");
        UserEntity source =(UserEntity) loginSuccessEvent.getSource();
        recordLog(source.getUsername());
    }

    public void recordLog(String username){
        System.out.println(username + "登录信息已被记录");
    }
}
