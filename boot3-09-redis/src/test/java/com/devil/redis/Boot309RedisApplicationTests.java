package com.devil.redis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;

import java.util.UUID;

@SpringBootTest
class Boot309RedisApplicationTests {

    @Autowired //key,value都是字符串
    StringRedisTemplate redisTemplate;

    /**
     * string： 普通字符串 ： redisTemplate.opsForValue()
     */
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("haha", UUID.randomUUID().toString());
        String haha = redisTemplate.opsForValue().get("haha");
        System.out.println(haha);
    }

    /**
     * list:    列表：       redisTemplate.opsForList()
     */
    @Test
    void testList(){
        String listName = "list1";
        redisTemplate.opsForList().leftPush(listName,"1");
        redisTemplate.opsForList().leftPush(listName,"2");
        redisTemplate.opsForList().leftPush(listName,"3");

        String pop = redisTemplate.opsForList().leftPop(listName);
        Assertions.assertEquals("3",pop);
    }

    /**
     * set:     集合:       redisTemplate.opsForSet()
     */
    @Test
    void testSet(){
        String setName = "set1";
        //1.给集合添加元素
        redisTemplate.opsForSet().add(setName,"1","2","3");

        Boolean aBoolean = redisTemplate.opsForSet().isMember(setName, "2");
        Assertions.assertTrue(aBoolean);

        Boolean aBoolean1 = redisTemplate.opsForSet().isMember(setName, "5");
        Assertions.assertFalse(aBoolean1);
    }

    /**
     * zset:    有序集合:    redisTemplate.opsForZSet()
     */
    @Test
    void testZset(){
        String zsetName = "zset1";
        redisTemplate.opsForZSet().add(zsetName,"devil",100.00);
        redisTemplate.opsForZSet().add(zsetName,"lisi",44.00);
        redisTemplate.opsForZSet().add(zsetName,"zhangsan",83.00);

        ZSetOperations.TypedTuple<String> max = redisTemplate.opsForZSet().popMax(zsetName);
        String value = max.getValue();
        Double score = max.getScore();
        System.out.println(value + "==>" + score); //devil==>100.0
    }

    /**
     * hash：   map结构：    redisTemplate.opsForHash()
     */
    @Test
    void testHash(){
        String mapName = "map1";
        redisTemplate.opsForHash().put(mapName,"name","张三");
        redisTemplate.opsForHash().put(mapName,"age","18");

        System.out.println(redisTemplate.opsForHash().get(mapName, "name"));//张三
    }
}
