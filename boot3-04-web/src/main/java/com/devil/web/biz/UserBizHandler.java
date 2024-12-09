package com.devil.web.biz;

import com.devil.web.bean.Person;
import jakarta.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName：UserBizHandler
 *
 * @author: Devil
 * @Date: 2024/12/9
 * @Description:专门处理user有关的业务
 * @version: 1.0
 */
@Slf4j
@Component
public class UserBizHandler {
    /**
     * 查询指定id的用户
     * @param request
     * @return
     */
    public ServerResponse getUser(ServerRequest request) throws Exception{
        String id = request.pathVariable("id");
        log.info("查询[{}]用户信息成功",id);
        //业务处理
        Person person = new Person(1L, "哈哈", "aaa@qq.com", 15, "admin");
        //构造响应
        return ServerResponse.ok().body(person);
    }

    /**
     * 获取所有用户
     * @param request
     * @return
     */
    public ServerResponse getUsers(ServerRequest request) throws Exception{
        log.info("查询所有用户信息成功");
        //业务处理
        List<Person> list = Arrays.asList(
                new Person(1L, "张三1", "aaa@qq.com", 15, "pm"),
                new Person(2L, "张三2", "zs2@qq.com", 16, "pm"));
        //构造响应
        return ServerResponse
                .ok()
                //凡是body中的对象，就是以前@ResponseBody原理，利用HttpMessageConverter 写出为json
                .body(list);
    }

    /**
     * 保存用户
     * @param request
     * @return
     */
    public ServerResponse saveUser(ServerRequest request) throws ServletException, IOException {
        Person body = request.body(Person.class);
        log.info("保存用户信息成功,{}",body);
        return ServerResponse.ok().build();
    }

    /**
     * 更新用户
     * @param request
     * @return
     */
    public ServerResponse updateUser(ServerRequest request) throws ServletException, IOException {
        Person body = request.body(Person.class);
        log.info("更新用户信息成功,{}",body);
        return ServerResponse.ok().build();
    }

    /**
     * 删除用户
     * @param request
     * @return
     */
    public ServerResponse deleteUser(ServerRequest request) {
        String id = request.pathVariable("id");
        log.info("删除[{}]用户信息成功",id);
        return ServerResponse.ok().build();
    }
}
