package com.devil.core.robot.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName：RobotProperties
 *
 * @author: Devil
 * @Date: 2024/12/11
 * @Description:
 * @version: 1.0
 */
@Data
@ConfigurationProperties(prefix = "robot")
@Component
public class RobotProperties {
    private String name;
    private String age;
    private String email;
}
