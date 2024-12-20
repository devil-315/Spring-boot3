package com.devil.rpc.service;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

/**
 * ClassName：WeatherInterface
 *
 * @author: Devil
 * @Date: 2024/12/20
 * @Description:
 * @version: 1.0
 */
public interface WeatherInterface {
    @GetExchange(url = "/area-to-weather-date",accept = "application/json")
    Mono<String> getWeather(@RequestParam("area") String city);
}
