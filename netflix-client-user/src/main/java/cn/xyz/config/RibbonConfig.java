/*
Copyright 2019 All rights reserved.
 */

package cn.xyz.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <pre>
 * Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡的工具。
 * 简单的说，Ribbon是Netflix发布的开源项目，主要功能是提供客户端的软件负载均衡算法，将Netflix的中间层服
 * 务连接在一起。Ribbon客户端组件提供一系列完善的配置项如连接超时，重试等。简单的说，就是在配置文件中
 * 列出Load Balancer（简称LB）后面所有的机器，Ribbon会自动的帮助你基于某种规则（如简单轮询，随机连接
 * 等）去连接这些机器。我们也很容易使用Ribbon实现自定义的负载均衡算法。
 * </pre>
 *
 * @author miaoqiang
 * @date 2020/3/18.
 */
@Configuration
@RibbonClients({@RibbonClient("SERVER-PROD")})
public class RibbonConfig {

    /**
     * 注入Ribbon客户端Bean
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
