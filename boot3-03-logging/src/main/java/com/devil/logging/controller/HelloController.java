package com.devil.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：HelloController
 *
 * @author: Devil
 * @Date: 2024/12/8
 * @Description:
 * @version: 1.0
 */
@Slf4j
@RestController
public class HelloController {
//    Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/h")
    public String hello(){
        log.trace("trace 日志...");
        log.debug("debug 日志...");
        log.info("info 日志..."); //SpringBoot底层默认的日志级别是info
        log.warn("warn 日志...");
        log.error("error 日志...");
        return "hello";
    }
}
