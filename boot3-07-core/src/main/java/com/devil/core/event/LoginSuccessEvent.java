package com.devil.core.event;

import com.devil.core.entity.UserEntity;
import org.springframework.context.ApplicationEvent;

/**
 * ClassName：LoginSuccessEvent
 *
 * @author: Devil
 * @Date: 2024/12/10
 * @Description:登录成功事件，所有事件都推荐继承 ApplicationEvent
 * @version: 1.0
 */
public class LoginSuccessEvent extends ApplicationEvent {
    /**
     *
     * @param source:代表谁登录成功了
     */
    public LoginSuccessEvent(UserEntity source) {
        super(source);
    }
}
