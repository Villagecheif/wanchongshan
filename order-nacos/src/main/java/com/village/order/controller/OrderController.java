package com.village.order.controller;/**
 * @author: villagechief
 * @date: 2023/8/29
 * @Description: Enjoy your work today! A better you a bigger world!
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Version V1.0
 * @Author: leo
 * @Date: 2023/8/29 22:06
 * @Description:Enjoy your work today! A better you a bigger world!
 */

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    RestTemplate restTemplate;

    /**
     * 这里模拟没有微服务状况下，直接使用http调用不同服务的接口
     * @return
     */
    @GetMapping("/add" )
    public String add() {
        System.out.println("下单成功");
        String msg = restTemplate.getForObject("http://127.0.0.1:8081/stock/add", String.class);
        return "Hello, world!"+msg;
    }
}
