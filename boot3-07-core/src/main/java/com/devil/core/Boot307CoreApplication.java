package com.devil.core;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Boot307CoreApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Boot307CoreApplication.class);

        //参数设置
//        application.addInitializers();

        application.run(args);
//        SpringApplication.run(Boot307CoreApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(){
        return args -> {
            System.out.println("===ApplicationRunner===运行了");
        };
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("===CommandLineRunner===运行了");
        };
    }

}
