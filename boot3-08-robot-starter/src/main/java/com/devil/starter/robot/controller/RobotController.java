package com.devil.starter.robot.controller;

import com.devil.starter.robot.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：RobotController
 *
 * @author: Devil
 * @Date: 2024/12/11
 * @Description:
 * @version: 1.0
 */
@RestController
public class RobotController {
    @Autowired
    RobotService robotService;
    @GetMapping("/robot/hello")
    public String sayHello(){
        String s = robotService.sayHello();
        return s;
    }
}
