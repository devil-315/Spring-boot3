package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName：LoginController
 *
 * @author: Devil
 * @Date: 2024/12/20
 * @Description:
 * @version: 1.0
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}
