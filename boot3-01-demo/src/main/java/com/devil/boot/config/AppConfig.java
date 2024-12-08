package com.devil.boot.config;

import com.alibaba.druid.FastsqlException;
import com.devil.boot.bean.Pig;
import com.devil.boot.bean.Sheep;
import com.devil.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * ClassName：AppConfig
 *
 * @author: Devil
 * @Date: 2024/12/7
 * @Description:
 * @version: 1.0
 */

/**
 * 开启sheep的组件绑定
 * 默认把这个组件自己放到容器中
 */
@EnableConfigurationProperties(Sheep.class)//导入第三方协会的组件进行属性绑定，因为SpringBoot默认只扫描自己主程序所在的包
//如果导入第三方包，即使组件上标注了@Component、@ConfigurationProperties注解，也没用，因为组件扫不进来
//@Import(FastsqlException.class) //给容器中放指定类型的组件，组件的名字默认是全类名
//@SpringBootConfiguration //与下面一个差别不大
@Configuration //这是一个配置类，替代以前的配置文件，配置类本身也是容器中的组件
public class AppConfig {
//    @ConfigurationProperties(prefix = "pig")
//    @Bean
//    public Pig pig(){
//        return new Pig();//我们自己new新pig
//    }

//    /**
//     * 1.组件默认是单实例的
//     * @return
//     */
//    @Scope("prototype") //调整为多实例
//    @Bean("UserHaha") //替代以前的Bean标签
//    public User user(){
//        User user = new User();
//        user.setId(1L);
//        user.setName("张三");
//        return user;
//    }
}
