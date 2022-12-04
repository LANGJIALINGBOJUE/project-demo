package com.langjialing.springbootswaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郎家岭伯爵
 */
@Api(tags = "测试 Swagger")
@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    @ApiOperation("测试RequestMapping")
    @RequestMapping("/test0")
    public String test0() {
        return "郎家岭伯爵";
    }

    @ApiOperation("测试GetMapping")
    @GetMapping("/test1")
    public String test1() {
        return "GetMapping";
    }

    @ApiOperation("测试PostMapping")
    @PostMapping("/test2")
    public String test2() {
        return "PostMapping";
    }
}