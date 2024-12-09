package com.devil.web.config;

import com.devil.web.component.MyYamlHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * ClassName：MyConfig
 *
 * @author: Devil
 * @Date: 2024/12/8
 * @Description:
 * @version: 1.0
 */
//@EnableWebMvc//禁用boot的默认配置
@Configuration //这是一个配置类，给容器中放一个WebMvcConfigurer组件，就能自定义底层
public class MyConfig /*implements WebMvcConfigurer*/ {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/a/","classpath:/b/")
                .setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
            }

            //配置消息转换器，配置一个能把对象转为yaml的messageConverter
            @Override
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
                converters.add(new MyYamlHttpMessageConverter());
            }
        };
    }
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //保留以前的默认配置
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//
//        //自定义配置
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("classpath:/a/","classpath:/b/","classpath:/static/")
//                .setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
//    }
}
