package log4j2;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slf4jTest {

    public static final Logger logger = LoggerFactory.getLogger(slf4jTest.class);

    @Test
    public void testslf4j(){
        //日志输出
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");//log4j默认使用的是info级别的日志输出


    }

}
