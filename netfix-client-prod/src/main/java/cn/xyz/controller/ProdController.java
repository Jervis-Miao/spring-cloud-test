package cn.xyz.controller;/*
Copyright 2019 All rights reserved.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author miaoqiang
 * @date 2020/3/18.
 */
@RestController
@RequestMapping("/prod")
public class ProdController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(path = "/getProd", method = RequestMethod.GET)
    public String getProd(Long prodId) {
        logger.info("prodId: {}", prodId);
        return "I'm prod!";
    }
}
