//package log4j;
//
////import com.sun.istack.internal.logging.Logger;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
//import org.apache.log4j.helpers.LogLog;
//import org.junit.Test;
//
//
//
//public class Log4jTest {
//
//    //quickstart
//    @Test
//    public void testQuick(){
//
//        //开启log4j内置日志记录
//        LogLog.setInternalDebugging(true);
//
//        //初始化配置信息，暂不使用配置文件
////        BasicConfigurator.configure();
//
//        //获取日志记录器对象
//        Logger logger = Logger.getLogger(Log4jTest.class);
//
//        //日志记录输出
//        logger.info("hello log4j");
//
////        for (int i = 0; i < 10000; i++) {
//            //日志级别
//            logger.fatal("fatal");//严重错误，一般会造成系统崩溃并终止运行
//            logger.error("error");//错误信息，不会影响系统运行
//            logger.warn("warn"); //警告信息，可能会发生问题
//            logger.info("info"); //运行信息，数据连接，网络连接，IO操作等等
//            logger.debug("debug");//调试信息，一般在开发中使用，记录程序变量参数传递信息等等
//            logger.trace("trace");//追踪信息，记录程序所有的流程信息
//            //log4j的默认级别是debug级别
////        }
//
//
//    }
//
//}
