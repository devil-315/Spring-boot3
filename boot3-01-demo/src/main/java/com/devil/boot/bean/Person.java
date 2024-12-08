package com.devil.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * ClassName：Person
 *
 * @author: Devil
 * @Date: 2024/12/8
 * @Description:
 * @version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "person") //和配置文件中person前缀的所有配置进行绑定
@Data//自动生成JavaBean属性的getter/setter
public class Person {
    private String name;
    private Integer age;
    private Date birthday;
    private Boolean like;
    private Child child;//嵌套对象
    private List<Dog> dogs;//数组（里面是对象）
    private Map<String ,Cat> cats;//Map
}
