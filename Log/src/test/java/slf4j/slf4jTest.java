//package slf4j;
//
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class slf4jTest {
//
//    public static final Logger logger = LoggerFactory.getLogger(slf4jTest.class);
//
//    @Test
//    public void testslf4j(){
//        //日志输出
//        logger.error("error");
//        logger.warn("warn");
//        logger.info("info");
//        logger.debug("debug");
//        logger.trace("trace");//log4j默认使用的是info级别的日志输出
//
//        //使用占位符输出日志信息
//        String name="goldstine";
//        Integer age=14;
//        logger.info("用户:{},{}",name,age);
//
//        //将系统的异常信息输出
//        try {
//            int i=1/0;
//        } catch (Exception e) {
////            e.printStackTrace();
//            logger.error("出现异常：",e);
//        }
//
//    }
//
//}
