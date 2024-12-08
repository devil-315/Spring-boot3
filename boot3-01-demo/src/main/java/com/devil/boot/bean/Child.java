package com.devil.boot.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * ClassName：Child
 *
 * @author: Devil
 * @Date: 2024/12/8
 * @Description:
 * @version: 1.0
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private Date birthday;
    private List<String > text;//数组
}
