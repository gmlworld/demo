package com.gongml.demo.redis;

import com.gongml.demo.redis.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: Gongml
 * @create: 2018-12-20 12:50
 **/
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        RedisUtil redisUtil = context.getBean(RedisUtil.class);
        System.out.println(redisUtil.get("hello"));
        System.out.println(redisUtil.set("hello",1));
        System.out.println(redisUtil.get("hello"));
    }
}
