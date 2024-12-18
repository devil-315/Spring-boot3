package com.devil.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName：UserEntity
 *
 * @author: Devil
 * @Date: 2024/12/10
 * @Description:
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {
    private String username;
    private String passwd;
}
