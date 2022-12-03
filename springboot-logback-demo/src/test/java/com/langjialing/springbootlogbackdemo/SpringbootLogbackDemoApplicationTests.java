package com.langjialing.springbootlogbackdemo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogbackDemoApplicationTests {

    static Logger logger = LoggerFactory.getLogger(SpringbootLogbackDemoApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("logback testing");
    }

    @Test
    void contextLoads0(){
        // 可以通过 StatusPrinter 来打印 Logback 的内部信息
        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }

    @Test
    void contextLoads1(){
        logger.debug("debug级别日志测试");
    }
}