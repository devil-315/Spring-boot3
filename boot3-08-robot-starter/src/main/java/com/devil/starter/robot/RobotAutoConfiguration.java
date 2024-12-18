package com.devil.starter.robot;

import com.devil.starter.robot.controller.RobotController;
import com.devil.starter.robot.properties.RobotProperties;
import com.devil.starter.robot.service.RobotService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ClassName：RobotAutoConfiguration
 *
 * @author: Devil
 * @Date: 2024/12/11
 * @Description:
 * @version: 1.0
 */
//使用@Import注解给容器中导入Robot功能要用的所有组件
@Import({RobotController.class, RobotProperties.class, RobotService.class})
@Configuration
public class RobotAutoConfiguration {
}
