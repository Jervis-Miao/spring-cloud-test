package cn.xyz;/*
Copyright 2019 All rights reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author miaoqiang
 * @date 2020/3/4.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class AppClient {

    public static void main(String[] args) {
        SpringApplication.run(AppClient.class);
    }

}
