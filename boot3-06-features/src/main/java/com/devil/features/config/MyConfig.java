package com.devil.features.config;

import com.devil.features.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * ClassName：MyConfig
 *
 * @author: Devil
 * @Date: 2024/12/10
 * @Description:
 * @version: 1.0
 */
@Profile("test")//只有指定环境被激活整个类的所有配置才能生效
@Configuration
public class MyConfig {

    @Bean
    public Cat cat() {
        return new Cat();
    }
}
