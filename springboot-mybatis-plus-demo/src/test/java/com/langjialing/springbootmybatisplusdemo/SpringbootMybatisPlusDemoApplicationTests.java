package com.langjialing.springbootmybatisplusdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.langjialing.springbootmybatisplusdemo.mapper.UserMapper;
import com.langjialing.springbootmybatisplusdemo.pojo.User;
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
        userMapper.insert(User.builder().id(3).age(18).name("郎家岭伯爵1").password("123456").build());
        userMapper.insert(User.builder().id(4).age(20).name("郎家岭伯爵2").password("123456").build());
        log.info("查询所有：{}", userMapper.selectList(null));
    }

    @Test
    void testQuery() {
        List<User> all = userMapper.selectList(null);
        log.info("查询所有：{}", all.toString());

        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("age",20);
        log.info("查询年龄为20：{}", userMapper.selectList(objectQueryWrapper));
    }

    @Test
    void testUpdate() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.setEntity(User.builder().id(1).build());

        User one = userMapper.selectOne(userQueryWrapper);
        log.info("更新前{}", one);
        one.setPassword("654321");
        one.setAge(20);
        userMapper.updateById(one);
        log.info("更新后{}", one);
    }

    @Test
    void testDelete() {
        QueryWrapper<User> deleteQueryWrapper = new QueryWrapper<>();
        deleteQueryWrapper.eq("age", 18);

        log.info("删除前{}", userMapper.selectList(null));
        userMapper.delete(deleteQueryWrapper);
        log.info("删除后{}", userMapper.selectList(null));
    }
}