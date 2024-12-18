package com.devil.crud.entity;

import lombok.Data;

/**
 * ClassName：Employee
 *
 * @author: Devil
 * @Date: 2024/12/18
 * @Description:
 * @version: 1.0
 */
@Data
public class Employee {
    private Long id;
    private String empName;
    private Integer age;
    private String email;
}
