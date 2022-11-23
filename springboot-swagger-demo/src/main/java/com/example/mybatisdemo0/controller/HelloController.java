package com.example.mybatisdemo0.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郎家岭伯爵
 */
@Api(tags = "欢迎页")
@RestController
@RequestMapping("/knife4j")
public class HelloController {

    @ApiOperation("欢迎使用knife4j")
    @RequestMapping("/test")
    public String test() {
        return "Hello,Knife4j!";
    }
}

