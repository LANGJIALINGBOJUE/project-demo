package com.langjialing.springbootfilterinterceptorlistenerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author 郎家岭伯爵
 */
@SpringBootApplication
@ServletComponentScan
public class SpringbootFilterInterceptorListenerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFilterInterceptorListenerDemoApplication.class, args);
    }

}