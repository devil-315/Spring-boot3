package com.devil.ssm.mapper;

import com.devil.ssm.bean.TUser;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName：UserMapper
 *
 * @author: Devil
 * @Date: 2024/12/9
 * @Description:
 * @version: 1.0
 */
public interface UserMapper {
    TUser getUserById(@Param("id") Long id);
}
