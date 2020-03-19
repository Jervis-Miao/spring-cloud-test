/*
Copyright 2019 All rights reserved.
 */

package cn.xyz.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author miaoqiang
 * @date 2020/3/18.
 */
@FeignClient("SERVER-PROD")
public interface ProdFeignConfig {

    @RequestMapping("/prod/getProd")
    public String getProd(@RequestParam("prodId") Long prodId);

}
