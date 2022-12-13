package com.langjialing.springbootfilterinterceptorlistenerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郎家岭伯爵
 */
@RestController
@RequestMapping("/myfilter")
public class MyFilterController {
    @RequestMapping("/hello0")
    public String sayHello0(){
        return "myFilter0";
    }

    @RequestMapping("/hello1")
    public String sayHello1(){
        return "myFilter1";
    }
}