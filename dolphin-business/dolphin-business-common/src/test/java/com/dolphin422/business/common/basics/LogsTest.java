package com.dolphin422.business.common.basics;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogsTest {

    // 首先获得日志记录这个对象
    static private Logger logger = LoggerFactory.getLogger(com.dolphin422.business.common.basics.Slf4jTest.class);

    @Test
    public void slf4jTest() {
        //记录error信息

        logger.error("[error message]");

        // 记录info，还可以传入参数

        logger.info("[info message],{},{}", false, new com.dolphin422.business.common.basics.Slf4jTest());

        // 记录deubg信息

        logger.debug("[debug message]");

        // 记录trace信息

        logger.trace("[trace message]");

        System.out.println("hello world");

    }

}
