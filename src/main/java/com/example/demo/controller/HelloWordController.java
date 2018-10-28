package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HIAPAD
 * @date: 2018/10/28 19:27
 * @description:
 */
@RestController()
@RequestMapping("/demo")
public class HelloWordController {
    @RequestMapping("/hello")
    public String index(){
        return  "hello word";
    }
}
