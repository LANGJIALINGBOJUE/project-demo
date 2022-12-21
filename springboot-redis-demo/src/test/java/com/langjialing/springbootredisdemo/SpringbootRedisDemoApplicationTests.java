package com.langjialing.springbootredisdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringbootRedisDemoApplicationTests {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testRedis() {
        // 添加
        redisTemplate.opsForValue().set("name","郎家岭伯爵");
        // 查询
        System.out.println(redisTemplate.opsForValue().get("name"));
        // 删除
        redisTemplate.delete("name");
        // 更新
        redisTemplate.opsForValue().set("name","郎家岭伯爵0", 20, TimeUnit.SECONDS);
        // 查询
        System.out.println(redisTemplate.opsForValue().get("name"));

        // 添加，并设置过期时间
        stringRedisTemplate.opsForValue().set("name0", "郎家岭伯爵", 30, TimeUnit.SECONDS);
        // 查询
        System.out.println(stringRedisTemplate.opsForValue().get("name0"));
        // 删除
        stringRedisTemplate.delete("name0");
        // 更新，并设置过期时间
        stringRedisTemplate.opsForValue().set("name0","郎家岭伯爵1", 30, TimeUnit.SECONDS);
        // 查询
        System.out.println(stringRedisTemplate.opsForValue().get("name0"));

    }

    @Test
    void Redis0(){
        System.out.println(redisTemplate.opsForValue().get("name"));

        // 根据key获取过期时间，并转换为指定时间单位
        System.out.println(redisTemplate.getExpire("name", TimeUnit.SECONDS));

        System.out.println(stringRedisTemplate.opsForValue().get("name0"));

        // 根据key获取过期时间，并转换为指定时间单位
        System.out.println(stringRedisTemplate.getExpire("name0", TimeUnit.SECONDS));
    }

}