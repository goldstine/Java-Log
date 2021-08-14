package com.goldstine.springbootlog;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogApplicationTests {

	//生命日志记录器对象
	public static final Logger LOGGER=LoggerFactory.getLogger(SpringbootLogApplicationTests.class);

	@Test
	public void testQuickStart(){
		//通过日志记录器对象打印所有的日志级别
		LOGGER.error("error");
		LOGGER.warn("warn");
		LOGGER.info("info");
		LOGGER.debug("debug");
		LOGGER.trace("trace");

		//使用log4j2使用桥接器切换为slf4j门面和logback的日志实现
		org.apache.logging.log4j.Logger logger = LogManager.getLogger(SpringbootLogApplicationTests.class);
		logger.info("log4j2 info");

	}

	@Test
	void contextLoads() {
	}

}
