package com.devil.core.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * ClassName：EventPublisher
 *
 * @author: Devil
 * @Date: 2024/12/10
 * @Description:
 * @version: 1.0
 */
@Service
public class EventPublisher implements ApplicationEventPublisherAware {

    /**
     * 底层发送事件的组件，SpringBoot会通过ApplicationEventPublisherAware接口自动注入给我们
     */
    ApplicationEventPublisher applicationEventPublisher;

    /**
     * 所有事件都可以发
     * @param event
     */
    public void sendEvent(LoginSuccessEvent event) {
        //调用底层API发送事件
        applicationEventPublisher.publishEvent(event);
    }

    /**
     * 自动调用，把真正发事件的底层组件给我们注入进来
     * @param applicationEventPublisher
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
