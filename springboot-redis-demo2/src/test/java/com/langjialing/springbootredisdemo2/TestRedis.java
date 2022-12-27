package com.langjialing.springbootredisdemo2;

import com.langjialing.springbootredisdemo2.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        stringRedisTemplate.opsForValue().set("langjialing0", "郎家岭伯爵");
        System.out.println(stringRedisTemplate.opsForValue().get("langjialing0"));
    }

    @Test
    public void testObj() throws Exception {
        User user=new User("1830879596@qq.com", "郎家岭伯爵", "langjialingbojue");
        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        operations.set("langjialing1", user);
        operations.set("langjialing2", user,1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        //redisTemplate.delete("com.neo.f");
        boolean exists=redisTemplate.hasKey("langjialing2");
        if(exists){
            System.out.println("exists is true");
        }else{
            System.out.println("exists is false");
        }
    }
}
