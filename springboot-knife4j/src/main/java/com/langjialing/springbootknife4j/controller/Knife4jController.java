package com.langjialing.springbootknife4j.controller;

import com.langjialing.springbootknife4j.commonts.res.BaseResponse;
import com.langjialing.springbootknife4j.model.vo.req.ReqUserVO;
import com.langjialing.springbootknife4j.model.vo.res.ResUserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author 郎家岭伯爵
 */
@Api(tags = "测试 Swagger")
@RestController
@RequestMapping("/swagger")
public class Knife4jController {

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
    public ResUserVO test2(ReqUserVO reqUserVO){
        if ("langjialing".equals(reqUserVO.getUserId()) && 123456==reqUserVO.getUserPassword()){
            return ResUserVO.builder().name("langjialing").age(20).sex("男").build();
        } else {
            return null;
        }
    }


    @ApiOperation("测试PostMapping")
    @PostMapping("/test3")
    public BaseResponse<?> test3(ReqUserVO userVO) {
        if ("langjialing".equals(userVO.getUserId()) && 123456==userVO.getUserPassword()){
            return BaseResponse.builder()
                    .messageBody(ResUserVO.builder().name("langjialing").age(20).sex("男").build())
                    .message("请求成功")
                    .code("200")
                    .build();
        } else {
            return BaseResponse.builder()
                    .message("请求失败，用户或密码错误")
                    .code("6001")
                    .build();
        }
    }
}