package com.devil.ssm.bean;

import lombok.Data;

/**
 * ClassName：TUser
 *
 * @author: Devil
 * @Date: 2024/12/9
 * @Description:
 * @version: 1.0
 */
@Data
public class TUser {
    private Long id;
    private String loginName;
    private String nickName;
    private String password;
}
