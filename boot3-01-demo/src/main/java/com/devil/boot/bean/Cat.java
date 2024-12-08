package com.devil.boot.bean;

import lombok.Data;

/**
 * ClassName：Cat
 *
 * @author: Devil
 * @Date: 2024/12/7
 * @Description:
 * @version: 1.0
 */
@Data
public class Cat {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
