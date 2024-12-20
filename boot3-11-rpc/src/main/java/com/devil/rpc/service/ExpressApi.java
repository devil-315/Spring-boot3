package com.devil.rpc.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

/**
 * ClassName：ExpressApi
 *
 * @author: Devil
 * @Date: 2024/12/20
 * @Description:
 * @version: 1.0
 */
public interface ExpressApi {
    @GetExchange(url = "https://express3.market.alicloudapi.com/express3",accept = "application/json")
    Mono<String> getExpress(@RequestParam("number") String number);
}
