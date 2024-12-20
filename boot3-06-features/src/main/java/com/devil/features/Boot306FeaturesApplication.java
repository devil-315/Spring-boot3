package com.devil.features;

import com.devil.features.bean.Cat;
import com.devil.features.bean.Dog;
import com.devil.features.bean.Pig;
import com.devil.features.bean.Sheep;
import com.devil.starter.robot.RobotAutoConfiguration;
import com.devil.starter.robot.annotation.EnableRobot;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * 1.标识环境
 *   1）、区分几个环境： dev（开发环境）、test（测试环境）、prod（生产环境）
 *   2）、指定每个组件在哪个环境下生效； default环境：默认环境
 *          通过： @Profile({"test"})标注
 *          组件没有标注@Profile代表任意时候都生效
 *   3）、默认只有激活指定的环境，这些组件才会生效。
 *2、激活环境
 *  配置文件激活：spring.profiles.active=dev；
 *  命令行激活： java -jar xxx.jar  --spring.profiles.active=dev
 *
 *3、配置文件怎么使用Profile功能
 *      1）、application.properties： 主配置文件。任何情况下都生效
 *      2）、其他Profile环境下命名规范：  application-{profile标识}.properties：
 *            比如：application-dev.properties
 *      3）、激活指定环境即可：  配置文件激活、命令行激活
 *      4）、效果：
 *          项目的所有生效配置项 = 激活环境配置文件的所有项 + 主配置文件和激活文件不冲突的所有项
 *          如果发生了配置冲突，以激活的环境配置文件为准。
 *          application-{profile标识}.properties 优先级高于 application.properties
 *
 *          主配置和激活的配置都生效，优先以激活的配置为准
 */
//@Import(RobotAutoConfiguration.class)
@EnableRobot
@Slf4j
@SpringBootApplication //主程序类
public class Boot306FeaturesApplication {

    public static void main(String[] args) {
        //1.SpringApplication：Boot应用的核心API入口
//        SpringApplication.run(Boot306FeaturesApplication.class, args);
//        //1.自定义SpringApplication的底层设置
//        SpringApplication springApplication = new SpringApplication(Boot306FeaturesApplication.class);
//
//        //跳转springApplication的参数
////        springApplication.setDefaultProperties();
//        //这个配置不优先，配置文件优先级高于程序化调整的优先级
//        springApplication.setBannerMode(Banner.Mode.CONSOLE); //开启Banner
//        springApplication.setBannerMode(Banner.Mode.OFF);
//
//        //2.SpringApplication运行起来
//        springApplication.run(args);

        //2.Builder方式构建SpringApplication；通过流式API（FluentAPI）进行设置
        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .main(Boot306FeaturesApplication.class)
                .sources(Boot306FeaturesApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .properties()//springboot所有配置项都可以在这里定义
//                .environment(null) //不能为空
//                .listeners(null)
                .run(args);

        try {
            Cat cat = context.getBean(Cat.class);
            log.info("组件cat：{}",cat);
        }catch (Exception e){

        }

        try {
            Dog dog = context.getBean(Dog.class);
            log.info("组件dog：{}",dog);
        }catch (Exception e){

        }



        try {
            Pig pig = context.getBean(Pig.class);
            log.info("组件pig：{}",pig);
        }catch (Exception e){

        }

        try {
            Sheep sheep = context.getBean(Sheep.class);
            log.info("组件sheep：{}",sheep);
        }catch (Exception e){

        }
    }

}
