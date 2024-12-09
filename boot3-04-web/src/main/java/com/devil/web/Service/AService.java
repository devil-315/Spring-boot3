package com.devil.web.Service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * ClassName：AService
 *
 * @author: Devil
 * @Date: 2024/12/9
 * @Description:
 * @version: 1.0
 */
@Service
public class AService {
    public  void a(){
        //当前请求的路径
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        //任意位置随便通过RequestContextHolder 获取到当前请求和响应信息
        HttpServletRequest request = attributes.getRequest();
        HttpServletResponse response = attributes.getResponse();

        String requestURI = request.getRequestURI();
    }
}
