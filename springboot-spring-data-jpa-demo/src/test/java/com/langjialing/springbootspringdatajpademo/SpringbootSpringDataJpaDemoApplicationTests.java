package com.langjialing.springbootspringdatajpademo;

import com.langjialing.springbootspringdatajpademo.entity.User;
import com.langjialing.springbootspringdatajpademo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class SpringbootSpringDataJpaDemoApplicationTests {

    @Resource
    private UserService userService;


    @Test
    void testQueryOne(){
        log.info("查询单条数据：{}", userService.findById(1));
    }

    @Test
    void testQueryAll(){
        log.info("查询所有数据：{}", userService.findAll());
    }

    @Test
    void testInsert(){
        log.info("插入数据前：{}", userService.findAll());

        userService.save(User.builder().id(3).age(18).name("郎家岭伯爵0").password("123456").build());
        userService.save(User.builder().id(4).age(18).name("郎家岭伯爵1").password("123456").build());
        userService.save(User.builder().id(5).age(18).name("LANGJIALINGBOJUE").password("123456").build());

        log.info("插入数据后：{}", userService.findAll());
    }

    @Test
    void testUpdate(){
        log.info("更新前：{}", userService.findById(1));

        userService.save(User.builder().id(1).name("LANGJIALINGBOJUE").age(18).password("654321").build());

        log.info("更新后：{}", userService.findById(1));
    }

    @Test
    void testDelete(){
        log.info("删除前：{}", userService.findAll());

        userService.delete(4);

        log.info("删除后：{}", userService.findAll());
    }

    @Test
    void testPage(){
        log.info("查询所有数据：{}", userService.findAll());
        userService.findAll(PageRequest.of(0,2)).stream().forEach(user -> log.info("分页查询{}", user));
    }

    @Test
    void testFuzzyQuery(){
        log.info("模糊查询：{}", userService.findByNameLikeIgnoreCase("%LANG%"));
    }
}