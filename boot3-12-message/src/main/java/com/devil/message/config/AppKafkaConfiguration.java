package com.devil.message.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * ClassName：AppKafkaConfiguration
 *
 * @author: Devil
 * @Date: 2024/12/20
 * @Description:
 * @version: 1.0
 */
@Configuration
public class AppKafkaConfiguration {
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("thing")
                .partitions(1)
                .compact().build();
    }
}
