package com.village.stock.controller;/**
 * @author: villagechief
 * @date: 2023/8/29
 * @Description: Enjoy your work today! A better you a bigger world!
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.SourceVersion;

/**
 * @Version V1.0
 * @Author: leo
 * @Date: 2023/8/29 22:28
 * @Description:Enjoy your work today! A better you a bigger world!
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @GetMapping("/add")
    public String reductions(){
        System.out.println("扣减库存成功 = " + true);
        return "扣减库存成功";
    }
}
