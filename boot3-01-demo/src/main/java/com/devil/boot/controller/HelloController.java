package com.devil.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：HelloController
 *
 * @author: Devil
 * @Date: 2024/12/7
 * @Description:
 * @version: 1.0
 */
//@ResponseBody
//@Controller
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello,Spring Boot 3!";
    };
}
