//package logback;
//
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class LogbackTest {
//
//    //这里是通过slf4j的方式使用日志门面的方式，所以所有的api都和对应的slf4j是一致的，所以直接将对应的代码复制过来即可
//    public static final Logger logger=LoggerFactory.getLogger(LogbackTest.class);
//
//    //logback快速入门
//    @Test
//    public void testLogback(){          //通过slf4j的api进行统一的管理
//
//        //测试日志文件的拆分
//        for (int i = 0; i < 10000; i++) {
//            //通过日志对象Logger输出对应的日志级别
//            logger.error("error");
//            logger.warn("warn");
//            logger.info("info");
//            logger.debug("debug"); //logback的默认是初级别是debug
//            logger.trace("trace");
//        }
//
//    }
//
//}
