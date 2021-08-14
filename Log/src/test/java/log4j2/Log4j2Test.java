package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;



public class Log4j2Test {

    //定义日志记录器对象
    public static final Logger logger= LogManager.getLogger(Log4j2Test.class);

    @Test
    public void testQuick(){
        //日志消息输出
        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }

}
