package com.devil.features.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：HelloController
 *
 * @author: Devil
 * @Date: 2024/12/10
 * @Description:
 * @version: 1.0
 */
@RestController
public class HelloController {
    //设置默认值，如果配置文件中没有haha，则用默认值
    @Value("${haha:哈哈哈哈}")
    String haha;
    @GetMapping("/haha")
    public String haha(){
        return haha;
    }
}
