package com.langjialing.springbootredisdemo2.controller;

import com.langjialing.springbootredisdemo2.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser() {
        User user = new User("1830879596@qq.com", "郎家岭伯爵", "langjialingbojue");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }
}
