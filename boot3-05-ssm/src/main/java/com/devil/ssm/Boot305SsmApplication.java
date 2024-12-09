package com.devil.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.@MapperScan【批量扫描注解】：告诉MyBatis，扫描哪个包下面的所有接口
 * 2.告诉MyBtis，每个接口的xml文件在哪
 * 3.MyBatis自动关联绑定
 */
@MapperScan(basePackages = "com.devil.ssm.mapper")
@SpringBootApplication
public class Boot305SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot305SsmApplication.class, args);
    }

}
