/*
Copyright 2019 All rights reserved.
 */

package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author miaoqiang
 * @date 2020/3/4.
 */
@EnableEurekaClient
@SpringBootApplication
public class AppClient {

    public static void main(String[] args) {
        SpringApplication.run(AppClient.class);
    }

}
