package com.devil.features;

import com.devil.features.service.HelloService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//测试类也必须在主程序所在的包及其子包
@SpringBootTest//具备测试SpringBoot应用容器中所有组件的功能
class Boot306FeaturesApplicationTests {

    @Autowired //自动注入任意组件即可测试
    HelloService helloService;
    @DisplayName("测试1")
    @Test
    void contextLoads() {
        int sum = helloService.sum(1, 2);
        Assertions.assertEquals(3,sum);
    }

    @DisplayName("测试2")
    @Test
    void test1(){
        System.out.println("1111");
    }

    @BeforeAll
    static void  initAll(){
        System.out.println("hello");
    }
    @BeforeEach
    void init(){
        System.out.println("world");
    }
}
