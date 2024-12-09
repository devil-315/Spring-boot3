package com.devil.web.controller;


import com.devil.web.bean.Person;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * ClassName：WelcomeController
 *
 * @author: Devil
 * @Date: 2024/12/8
 * @Description:
 * @version: 1.0
 */
@Controller //适配 服务端渲染 前后不分离模式开始
public class WelcomeController {
    /**
     * 利用模板引擎跳转到指定页面
     * @return
     */
    @GetMapping("/well")
    public String hello(@RequestParam("name") String name, Model model){
        //模板的逻辑视图名
        //物理视图 = 前缀 + 逻辑视图名 + 后缀
        //真实地址 = classpath:/templates/welcome.html

        //把需要给页面恭喜的数据放到model中
        model.addAttribute("msg",name);
        model.addAttribute("imgUrl","/static/2.jpg");
        return "welcome";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Person> list = Arrays.asList(
                new Person(1L, "张三1", "", 15, "pm"),
                new Person(3L, "张三2", "zs2@qq.com", 16, "pm"),
                new Person(4L, "张三333", "zs3@qq.com", 17, "pm"),
                new Person(7L, "张三444", "zs4@qq.com", 18, "admin"),
                new Person(8L, "张三5", "zs5@qq.com", 19, "hr")
        );
        model.addAttribute("persons",list);
        return "list";
    }

    /**
     * 来到首页
     * @return
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
