package com.devil.rpc.config;

//import com.devil.rpc.service.ExpressApi;
import com.devil.rpc.service.ExpressApi;
import com.devil.rpc.service.WeatherInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
/**
 * ClassName：WeatherConfiguration
 *
 * @author: Devil
 * @Date: 2024/12/20
 * @Description:
 * @version: 1.0
 */
@Configuration
public class WeatherConfiguration {

    @Bean
    HttpServiceProxyFactory httpServiceProxyFactory(@Value("${aliyun.appcode}") String appCode){
        //1、创建客户端
        WebClient client = WebClient.builder()
                .defaultHeader("Authorization","APPCODE "+appCode)
                .baseUrl("https://ali-weather.showapi.com")
                .codecs(clientCodecConfigurer -> {
                    clientCodecConfigurer
                            .defaultCodecs()
                            .maxInMemorySize(256*1024*1024);
                    //响应数据量太大有可能会超出BufferSize，所以这里设置的大一点
                })
                .build();

        //2、创建工厂
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(client)).build();

        return factory;
    }
    @Bean
    WeatherInterface weatherInterface(HttpServiceProxyFactory httpServiceProxyFactory){

        //3、获取代理对象
        WeatherInterface weatherInterface = httpServiceProxyFactory.createClient(WeatherInterface.class);

        return weatherInterface;
    }

    @Bean
    ExpressApi expressApi(HttpServiceProxyFactory httpServiceProxyFactory){
        ExpressApi client = httpServiceProxyFactory.createClient(ExpressApi.class);
        return client;
    }
}
