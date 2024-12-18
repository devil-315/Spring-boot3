package com.devil.starter.robot.service;

import com.devil.starter.robot.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName：RobotService
 *
 * @author: Devil
 * @Date: 2024/12/11
 * @Description:
 * @version: 1.0
 */
@Service
public class RobotService {
    @Autowired
    RobotProperties robotProperties;

    public String sayHello(){
        return "你好，我叫["+ robotProperties.getName() +"];我: ["+robotProperties.getAge() + "]岁了" ;
    }
}
