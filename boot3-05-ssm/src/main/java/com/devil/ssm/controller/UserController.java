package com.devil.ssm.controller;

import com.devil.ssm.bean.TUser;
import com.devil.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：UserController
 *
 * @author: Devil
 * @Date: 2024/12/9
 * @Description:
 * @version: 1.0
 */

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    /**
     * 返回User的JSON数据
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public TUser getUser(@PathVariable("id") Long id){
        TUser user = userMapper.getUserById(id);
        return user;
    }
}
