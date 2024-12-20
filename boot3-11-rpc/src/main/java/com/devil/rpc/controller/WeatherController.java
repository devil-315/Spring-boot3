package com.devil.rpc.controller;

import com.devil.rpc.service.ExpressApi;
import com.devil.rpc.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * ClassName：WeatherController
 *
 * @author: Devil
 * @Date: 2024/12/20
 * @Description:
 * @version: 1.0
 */
@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;

    @Autowired
    ExpressApi expressApi;

    @GetMapping("/weather")
    public Mono<String> weather(@RequestParam("city") String city){
        //查询天气
        Mono<String> weather = weatherService.weather(city);
        return weather;
    }

    @GetMapping("/express")
    public Mono<String> express(@RequestParam("number") String number){

        //获取物流
        return expressApi.getExpress(number);
    }
}
