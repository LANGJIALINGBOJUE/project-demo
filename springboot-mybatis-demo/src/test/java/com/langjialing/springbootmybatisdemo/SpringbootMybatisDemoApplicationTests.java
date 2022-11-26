package com.langjialing.springbootmybatisdemo;

import com.langjialing.springbootmybatisdemo.mapper.UserMapper;
import com.langjialing.springbootmybatisdemo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class SpringbootMybatisDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsert() {
        userMapper.insert(User.builder().age(18).name("郎家岭伯爵0").password("123456").build());
        userMapper.insert(User.builder().age(18).name("郎家岭伯爵1").password("123456").build());
        log.info("查询所有：{}", userMapper.getAll().toString());
    }

    @Test
    void testQuery() {
        List<User> all = userMapper.getAll();
        log.info("查询所有：{}", all.toString());
    }

    @Test
    void testUpdate() {
        User one = userMapper.getOne(6);
        log.info("更新前{}", one);
        one.setPassword("654321");
        userMapper.update(one);
        log.info("更新后{}", userMapper.getOne(6));
    }

    @Test
    void testDelete() {
        log.info("删除前{}", userMapper.getAll().toString());
        userMapper.delete(6);
        log.info("删除后{}", userMapper.getAll().toString());

    }

}