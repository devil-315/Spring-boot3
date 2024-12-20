package com.devil.message;

import com.devil.message.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.StopWatch;

import java.util.concurrent.CompletableFuture;

@SpringBootTest
class Boot312MessageApplicationTests {

    @Autowired
    KafkaTemplate kafkaTemplate;
    @Test
    void contextLoads() {
        StopWatch stopWatch = new StopWatch();

        CompletableFuture[] futures = new CompletableFuture[10000];

        stopWatch.start();
        for (int i = 0;i < 10000;i++){
            //JUC
            CompletableFuture future = kafkaTemplate.send("news", "oh!", "是你！");
            futures[i] = future;
        }

        CompletableFuture.allOf(futures).join();

        stopWatch.stop();

        long totalTimeMillis = stopWatch.getTotalTimeMillis();

        System.out.println("10000个消息发送完成，时间：" + totalTimeMillis);
    }

    @Test
    void send(){
        CompletableFuture future = kafkaTemplate.send("news", "person", new Person(1, "devil", "123@qq.com"));

        future.join();
        System.out.println("消息发送成功");
    }
}
