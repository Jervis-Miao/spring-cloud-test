/*
Copyright 2019 All rights reserved.
 */

package cn.xyz.controller;

import cn.xyz.config.ProdFeignConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author miaoqiang
 * @date 2020/3/18.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String PROD_URL = "http://SERVER-PROD";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private ProdFeignConfig prodFeignConfig;

    @RequestMapping(path = "/getProdByRibbon", method = RequestMethod.GET)
    public String getProdByRibbon(Long prodId) {
        return restTemplate.getForObject(PROD_URL + "/prod/getProd", String.class);
    }

    @RequestMapping(path = "/getProdByFeign", method = RequestMethod.GET)
    public String getProdByFeign(Long prodId) {
        return prodFeignConfig.getProd(prodId);
    }
}
