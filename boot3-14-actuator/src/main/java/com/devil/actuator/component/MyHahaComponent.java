package com.devil.actuator.component;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;


/**
 * ClassName：MyHahaComponent
 *
 * @author: Devil
 * @Date: 2024/12/20
 * @Description:
 * @version: 1.0
 */
@Component
public class MyHahaComponent {

    Counter counter = null;
    /**
     * 注入 meterRegistry 来保存和统计所有指标
     * @param meterRegistry
     */
    public MyHahaComponent(MeterRegistry meterRegistry){
        //得到一个名叫 myhaha.hello 的计数器
        counter = meterRegistry.counter("myhaha.hello");
    }
    public int check(){
        //业务代码判断这个组件是否该是存活状态
        return 1;
    }

    public void hello(){
        System.out.println("hello");
        counter.increment();
    }
}
