package com.langjialing.springbootmybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 郎家岭伯爵
 */
@SpringBootApplication
@MapperScan
public class SpringbootMybatisPlusDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPlusDemoApplication.class, args);
    }

}
