/*
Copyright 2019 All rights reserved.
 */

package cn.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author miaoqiang
 * @date 2020/3/4.
 */
@SpringBootApplication
@EnableEurekaServer
public class AppServer {

    public static void main(String[] args) {
        SpringApplication.run(AppServer.class);
    }
}
