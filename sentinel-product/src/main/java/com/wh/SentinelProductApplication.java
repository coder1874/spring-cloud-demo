package com.wh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangwenhao
 * @description SentinelProductApplication
 * @date 2020-06-17 09:19
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SentinelProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelProductApplication.class, args);
    }
}
