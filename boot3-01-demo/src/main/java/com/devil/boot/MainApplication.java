package com.devil.boot;

import com.alibaba.druid.FastsqlException;
import com.devil.boot.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName：MainApplication
 *
 * @author: Devil
 * @Date: 2024/12/7
 * @Description: 启动SpringBott项目的主入口程序
 * @version: 1.0
 */
@SpringBootApplication //这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        //java10: 局部变量类型的自动推断
        var ioc = SpringApplication.run(MainApplication.class,args);

        Person person = ioc.getBean(Person.class);
        System.out.println("person:"+person);
//        Sheep sheep = ioc.getBean(Sheep.class);
//        System.out.println("sheep:"+sheep);
//        Pig pig = ioc.getBean(Pig.class);
//        System.out.println("pig:"+pig);
//        for(String s : ioc.getBeanNamesForType(Cat.class)){
//            System.out.println("cat:"+s);
//        }
//        for (String s : ioc.getBeanNamesForType(Dog.class)) {
//            System.out.println("dog:"+s);
//        }
//        for (String s : ioc.getBeanNamesForType(User.class)) {
//            System.out.println("user:" + s);
//        }
//        //1.获取容器中所有组件的名字
//        String[] names = ioc.getBeanDefinitionNames();
//        //2.遍历
//        for (String name : names){
//            System.out.println(name);
//        }
//        String[] forType = ioc.getBeanNamesForType(User.class);
//        for(String s : forType){
//            System.out.println(s); //UserHaha
//        }
//
//        String[] forType2 = ioc.getBeanNamesForType(FastsqlException.class);
//        for(String s : forType2){
//            System.out.println(s); //com.alibaba.druid.FastsqlException
//        }
//        Object userHaha1 = ioc.getBean("UserHaha");
//        Object userHaha2 = ioc.getBean("UserHaha");
//        System.out.println(userHaha1.equals(userHaha2));
    }
}
