package com.devil.web.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * ClassName：Person
 *
 * @author: Devil
 * @Date: 2024/12/8
 * @Description:
 * @version: 1.0
 */
@JacksonXmlRootElement//可以写出为xml文档
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long id;
    private String userName;
    private String email;
    private Integer age;
    private String role;
}